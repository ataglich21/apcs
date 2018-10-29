
import java.util.Scanner;
//import java.lang.Object; 


//TODO:
//Make getting stickNum a method? 
//multiplayer system? VS ai? 
// put everything in a for loop until num of sticks = 0. 
 

public class nim

{

    
   public static void main() {
       //initializing vars :)
       Scanner in = new Scanner(System.in);
       
    //gets 'plyrcnt', the number of players, and initializes an array with that num.
    System.out.println("Hello! Welcome to Nim. How many people are playing?");
    int plyrCnt = in.nextInt() + 1; 
      
    String[] plyrNames = new String[plyrCnt]; 
    
    //puts player names into array 
    System.out.println("What are the player's names?");
    for (int i = 0; i < plyrCnt; i++) {
       plyrNames[i] = in.nextLine(); 
    } 
    

    System.out.println("How many sticks do you want to start?");
    int stickNum = in.nextInt(); 
        if (stickNum <= 0)
          throw new ArithmeticException("Can't do <1 sticks!");
         
    //prints bars (duh)
    printBars(stickNum); 
    
    int i = 1; 
        while (stickNum > 0) {
            if (i == plyrCnt) {
                i = 1; 
            }
            System.out.println(plyrNames[i] + ", How many sticks would you like to remove?");
      
            stickNum -= in.nextInt();
            printBars(stickNum);
            i++; 
            
         
    }
    
    if(stickNum <= 0){
        System.out.println(plyrNames[i-1] + " is the loser!"); 
    }
    
    }
       
    // prints the bars left
    public static void printBars(int stickNum){
        for(int i=0; i<stickNum; i++) {
            System.out.print("| "); 
        }
        System.out.print("\n"); 
        
    }
    
    

    }
    
        
