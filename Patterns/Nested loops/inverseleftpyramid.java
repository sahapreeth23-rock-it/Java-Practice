   public class inverseleftpyramid {
       public static void main(String[] args) {
           int n =4;
           //outer loop for rows
           for(int i=n; i>=1; i--) {
               //inner loops for stars print
               for(int j =1; j<=i; j++) {
                   System.out.print("*");
               }   
               System.out.println( );
            }
        }
    }
    
