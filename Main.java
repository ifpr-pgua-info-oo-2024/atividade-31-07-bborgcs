import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static Date convertStringtoDate(String nascimento) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(nascimento);
    }
    
    public static void main(String[] args) throws ParseException {
        Academia a = new Academia("World", "Rua Tókio, 472", "41 9999-9999");

       System.out.println(a.getNome()+" "+a.getEndereco()+" "+a.getTelefone());
       a.setNome("Bio Aventura");
       a.setEndereco("Av Bento Munhoz da Rocha Neto, 12");
       a.setTelefone("41 3333-3333");
       System.out.println(a.getNome()+" "+a.getEndereco()+" "+a.getTelefone());

       
       a.alunos.add(new Aluno("Maria", "iniciante", convertStringtoDate("10/12/2007")));
       a.alunos.add(new Aluno("Kauany", "avançado", convertStringtoDate("17/04/2007"), "feminino", 1.57, 45.00));
       a.alunos.add(new Aluno("João", "intermediário", convertStringtoDate("16/09/1999")));
       
       for (Aluno aluno : a.getAlunos()) {
           System.out.println(aluno.toString());
       }

       Academia b = new Academia("caopi", "lgbhfd, 77", "41 3434-5677");

       System.out.println("\n\n\n     OBJETO 2 ");
       System.out.println(b.getNome()+" "+ b.getEndereco()+" "+b.getTelefone());

       b.setNome("dominio");
       b.setEndereco("Av Roque, 32");
       b.setTelefone("41 2193-9856");
       
       System.out.println(b.getNome()+" "+b.getEndereco()+" "+b.getTelefone());

       b.alunos.add(new Aluno("Clara", "iniciante", convertStringtoDate("30/07/1987")));
       b.alunos.add(new Aluno("Marcela", "avançado", convertStringtoDate("17/05/2000"), "feminino", 1.57, 45.00));
       b.alunos.add(new Aluno("Paulo", "intermediário", convertStringtoDate("11/11/2011")));
       
       for (Aluno aluno : b.getAlunos()) {
           System.out.println(aluno.toString());
       }
       

    }
}