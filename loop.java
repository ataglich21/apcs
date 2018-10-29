

public class loop
{
    public static void printPyrimid(int height) {
        for (int i = 1; i < height; i++){
            //prints spaces (spaces are height - 1
         for (int j = height - i; j > 0; j--){
             System.out.print(" "); 
            }
            //prints odd amount of x's
            printRow(2* i - 1); 
    }
}

public static void printRow(int n){
        for(int i = 0; i < n; i++){
            System.out.print("X");
        }
        System.out.print("\n");
  }
}
