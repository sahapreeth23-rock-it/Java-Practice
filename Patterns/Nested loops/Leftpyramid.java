   public class Leftpyramid {
       public static void main(String[] args) {
           int n =4;
           //outer loop for rows calculation
           for ( int i=1; i <=n; i++ ) {
               //inner loop for stars print
               for(int j=1; j<=i; j ++) {
                   System.out.print("*");
               }
               System.out.println();
           }
       }
   }
    
