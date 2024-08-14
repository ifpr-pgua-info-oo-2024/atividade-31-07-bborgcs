import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {

    private String nome;
    private Date idade; //data de idadeimento
    private String genero;
    private double altura;
    private double peso;

    public Pessoa (String nome, String idade, String genero, double altura, double peso) throws ParseException {
        this.nome = nome;
        this.idade = convertStringToDate(idade);
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa (String nome, String idade) throws ParseException {
        this(nome,idade, " ", 0, 0);
    }


    public String getNome() {
        return this.nome;
    }

    public Date getIdade(){
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


    public static Date convertStringToDate(String idade) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.parse(idade);
    }
 
    public static String convertDateToString(Date idade) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(idade); 
    }

    public static int calcularIdade (Date idade) {
        Date actualDate = new Date();

        long diffInMillies = Math.abs(actualDate.getTime() - idade.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) diff/365;
    } 

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + calcularIdade(idade) + ", genero=" + genero + ", altura=" + altura + ", peso="
                + peso;
    }
}
