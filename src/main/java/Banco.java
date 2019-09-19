import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        List<Cliente> clientesExistentes = new ArrayList<>();
        List<ContaCorrente> contasExistentes = new ArrayList<>();
        List<CartaoCredito> cartaoExistentes = new ArrayList<>();
        while (true) {
            Scanner ler = new Scanner(System.in);
            System.out.println(
                    "1 - Cadastrar conta corrente e cartao de credito \n" +
                            "2 - Pagar conta com cartao de credito \n" +
                            "3 - Pagar conta com conta corrente \n" +
                            "4 - Depositar em conta corrente \n" +
                            "5 - Sacar conta corrente \n" +
                            "6 - Listar Clientes \n" +
                            "7 - Consultar status da conta de um cliente(CPF) \n" +
                            "8 - Atualizar limite do cartao de credito \n" +
                            "9 - Pagar a fatura do cartao credito \n" +
                            " 0 - Sair");

            int option = ler.nextInt();
            switch (option) {
                case 1:
                    ServiceConta novaConta = new ServiceConta();
                    Cliente cliente = novaConta.cadastroCliente(clientesExistentes);
                    novaConta.cadastroConta(contasExistentes, cliente);
                    novaConta.cadastroCartao(cartaoExistentes, cliente);
                    break;
                case 2:
                    ServiceConta pagcard = new ServiceConta();
                    pagcard.pagarcartao(cartaoExistentes);
                    break;
                case 3:
                    ServiceConta pag = new ServiceConta();
                    pag.pagar(contasExistentes);
                    break;
                case 4:
                    ServiceConta dep = new ServiceConta();
                    dep.deposito(contasExistentes);
                    break;
                case 5:
                    ServiceConta sac = new ServiceConta();
                    sac.sacar(contasExistentes);
                case 6:
                        System.out.println(clientesExistentes);
                    break;
                case 7:
                    System.out.println("Informe o CPF: ");
                    int x = ler.nextInt();
                    for (int i = 0; i < contasExistentes.size(); i++) {
                        int j = contasExistentes.get(i).getTitular().getCPF();
                        if(x == j){
                            System.out.println(contasExistentes.get(i));
                        }
                    }
                    break;
                case 8:
                case 9:
                default:
                    break;

            }


        }
    }

}
