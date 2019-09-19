public class Cliente {
    private String nome;
    private String profissao;
    private int CPF;

    public Cliente(String nome, String profissao, int CPF) {
        this.nome = nome;
        this.profissao = profissao;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", profissao='" + profissao + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
