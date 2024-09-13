import java.util.Random;
import java.util.Scanner;


public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {


        Random r= new Random();
        System.out.println("If you get number 7 you win");
        Scanner in = new Scanner(System.in);
        int raha= 0;
        String playagain;

        int nro1,nro2,nro3;
        System.out.println("How much is budjet");
        raha = Integer.parseInt(in.nextLine());
        for (int i=1; i<=99; i++)
        {
            
        

        nro1 = r.nextInt(10)+1;
        nro2 = r.nextInt(10)+1;
        nro3 = r.nextInt(10)+1;

        System.out.println(nro1);
        System.out.println(nro2);
        System.out.println(nro3);

        
        raha = raha-1;
        if(nro1==7 && nro2==7 && nro3==7){
            System.err.println("Jackpot!!!!");    
            raha = raha+99999999; }

            

        else if(nro1==7 && nro2==7 || nro1 ==7 && nro3==7 || nro2==7 && nro3==7){
            System.out.println("Chilli voitto");
            raha = raha+50;    }
            
        else if(nro1==7 || nro2==7 || nro3==7){
             System.out.println("Congrats you won!");
             raha = raha+3;}
        
    
        else 
         {
        System.out.println("You lost");
         }
        System.out.println("You have  " + raha + " euro left" );
        System.out.println("Again Y/N");
        playagain = in.nextLine();
        
            if(playagain.equalsIgnoreCase("n")) {
                break;
            }
            
           

            if(raha==0) {

                System.out.println("Thanks for  playing");
                 break;
            
            } 

    }
        


    
        
     
    
    }
        } 
 
    

