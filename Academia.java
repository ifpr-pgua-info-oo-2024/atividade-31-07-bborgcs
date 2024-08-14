import java.util.ArrayList;
import java.util.List;

public class Academia {

    public static Object aluno;
    private String nome;
    private String endereco;
    private String telefone;

    List<Aluno> alunos;

    public Academia(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        alunos = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}