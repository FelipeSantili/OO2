import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private ArrayList<Orcamento> orcamentos;

    public Cliente() {
        this.orcamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void addOrcamento(Orcamento orcamento) {
        orcamentos.add(orcamento);
    }

    public ArrayList<Orcamento> getOrcamentos() {
        return orcamentos;
    }
}
