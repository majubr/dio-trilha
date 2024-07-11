
import java.util.Scanner;


public class ContaTerminal {


    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);
        Scanner sc4 = new Scanner (System.in);
        
        System.out.println("Por favor digite o numero da sua conta");
        int numero = sc1.nextInt();
        
        System.out.println("Por favor digite o nome da agencia");
        String agencia = sc2.nextLine();
        
        System.out.println("Por favor digite o nome do cliente");
        String cliente = sc3.nextLine();

        
        System.out.println("Por favor digite o saldo");
        float saldo = sc4.nextFloat();
        
        System.out.println ("Olá " + cliente + 
        " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        " conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque.");
    }

  



  
}
