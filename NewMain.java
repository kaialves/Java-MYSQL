import java.sql.Connection;
        
public class NewMain {

   
    public static void main(String[] args) {
        System.out.println("--Conectando com Java--");
        
        try {
         Connection conn = DataBaseUtils.getconnection("Banco", "User", "Senha")
            System.out.println("Conectou");
        } catch (Exception e) {
            System.out.println("Não conectou");
            e.printStackTrace();
        }
    }
    

}