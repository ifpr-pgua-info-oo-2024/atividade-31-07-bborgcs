public class Main {
    
    public static void main(String[] args) {

       Academia a = new Academia("World", "Rua Tókio, 472", "41 9999-9999");
 
       System.out.println(a.getNome()+" "+a.getEndereco()+" "+a.getTelefone());
       a.setNome("Bio Aventura");
       a.setEndereco("Av Bento Munhoz da Rocha Neto, 12");
       a.setTelefone("41 3333-3333");
       System.out.println(a.getNome()+" "+a.getEndereco()+" "+a.getTelefone());

       Academia b = new Academia("caopi", "lgbhfd, 77", "41 3434-5677");

       System.out.println("     OBJETO 2 ");
       System.out.println(b.getNome()+" "+ b.getEndereco()+" "+b.getTelefone());

       b.setNome("dominio");
       b.setEndereco("Av Roque, 32");
       b.setTelefone("41 2193-9856");
       
       System.out.println(b.getNome()+" "+b.getEndereco()+" "+b.getTelefone());


    }
 
}
