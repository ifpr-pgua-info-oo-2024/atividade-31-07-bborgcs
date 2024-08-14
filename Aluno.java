import java.text.ParseException;

public class Aluno extends Pessoa{

    private String nivel;
    
    public Aluno (String nome, String nivel, String idade, String genero, double altura, double peso) throws ParseException {
        super(nome, idade, genero, altura, peso);
        this.nivel = nivel;
    }

    public Aluno (String nome, String nivel, String idade) throws ParseException {
        this(nome, nivel, idade, " ", 0 , 0);
    }

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString()+" nivel:" + nivel+ "]";
    }

    
}