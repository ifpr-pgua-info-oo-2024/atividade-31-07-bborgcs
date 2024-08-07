import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {

    private String nome;
    private String nivel;
    private Date idade; //data de nascimento
    private String genero;
    private double altura;
    private double peso;

    public Aluno (String nome, String nivel, Date idade, String genero, double altura, double peso) {
        this.nome = nome;
        this.nivel = nivel;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno (String nome, String nivel, Date idade) {
        this(nome, nivel, idade, "", 0 , 0);
    }

    public String getNome() {
        return this.nome;
    }

    public String getNivel() {
        return this.nivel;
    }

    public Date getIdade() {
        return this.idade;
    }

    public String getGenero() {
        return this.genero;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setIdade(Date idade) {
        this.idade = idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Aluno {nome:" + nome + ", nivel:" + nivel + ", data de nascimento:" + simpleDateFormat.format(idade) + ", genero:" + genero + ", altura:"
                + altura + ", peso:" + peso + "}";
    }

    
}