import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class ServiceConta {
    Scanner ler = new Scanner(System.in);

    public Cliente cadastroCliente(List<Cliente> clientesExistentes) {
        System.out.println("Informe seu nome: ");
        String nome = ler.next();
        System.out.println("Informe sua profissao: ");
        String profissao = ler.next();
        System.out.println("Infome seu CPF: ");
        int CPF = ler.nextInt();
        Cliente novoCliente = new Cliente(nome, profissao, CPF);
        clientesExistentes.add(novoCliente);
        return novoCliente;
    }

    public void cadastroConta(List<ContaCorrente> contasExistentes, Cliente cliente) {
        System.out.println("Informe o número da conta: ");
        int numero = ler.nextInt();
        double saldo = 0;
        ContaCorrente contaCorrente = new ContaCorrente(cliente, numero, saldo);
        contasExistentes.add(contaCorrente);

    }

    public void cadastroCartao(List<CartaoCredito> cartaoExistentes, Cliente cliente) {
        List<Integer> numCard = new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            numCard.add(i);
        }
        for (int i = 0; i <= numCard.size(); i++) {
            Collections.shuffle(numCard);
        }
        String num = numCard.stream().map(String::valueOf).collect(Collectors.joining());
        String numero = (num.substring(0, 4) + "." + num.substring(4, 8) + "." + num.substring(8, 12) + "." + num.substring(12, 16));
        System.out.println("o numero do seu cartão é: " +numero);
        double limite = 400;
        double fatura = 0;
        CartaoCredito novoCartao = new CartaoCredito(cliente, numero, limite, fatura);
        cartaoExistentes.add(novoCartao);
    }

    public void deposito(List<ContaCorrente> dep) {
        System.out.println("informe o valor que deseja depositar: ");
        double x = ler.nextDouble();
        System.out.println("Informe o numero da conta para deposito: ");
        int nc = ler.nextInt();
        for (int i = 0; i < dep.size(); i++) {
            if (nc == dep.get(i).getNumero()) {
                double j = dep.get(i).getSaldo();
                double z = x + j;
                dep.get(i).setSaldo(z);
            }
        }
    }

    public void pagar(List<ContaCorrente> pag) {
        System.out.println("informe o valor da conta a ser paga: ");
        double x = ler.nextDouble();
        System.out.println("Informe o numero da conta que sera utilizada para pagamento: ");
        int nc = ler.nextInt();
        for (int i = 0; i < pag.size(); i++) {
            if (nc == pag.get(i).getNumero() && x < pag.get(i).getSaldo() && x >= 0) {
                double j = pag.get(i).getSaldo();
                double z = j - x ;
                pag.get(i).setSaldo(z);
            } else {
                System.out.println("Saldo insuficiente!");
            }

        }
    }
    public void pagarcartao(List<CartaoCredito> pagcard){
        System.out.println("informe o valor da conta a ser paga: ");
        double x = ler.nextDouble();
        System.out.println("Informe o numero do cartao de credito: ");
        String nc = ler.next();
        for (int i = 0; i < pagcard.size(); i++) {
            if (nc == pagcard.get(i).getNumero() && x < pagcard.get(i).getFatura() && x >= 0) {
                double j = pagcard.get(i).getFatura();
                double z = j - x ;
                pagcard.get(i).setFatura(z);
            } else {
                System.out.println("Saldo insuficiente!");
            }

        }
    }
    public void sacar(List<ContaCorrente> sac){
        System.out.println("informe o valor do saque: ");
        double x = ler.nextDouble();
        System.out.println("Informe o numero da conta: ");
        int nc = ler.nextInt();
        for (int i = 0; i < sac.size(); i++) {
            if (nc == sac.get(i).getNumero() && x < sac.get(i).getSaldo() && x >= 0) {
                double j = sac.get(i).getSaldo();
                double z = j - x ;
                sac.get(i).setSaldo(z);
            } else {
                System.out.println("Saldo insuficiente!");
            }

        }
    }
}



