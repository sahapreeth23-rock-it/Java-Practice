import java.util.Scanner;
public class twoinput {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x==y) {
            System.out.println("Equal");
        } else if(x > y) {
                System.out.println("a is greater than b");
        }
             else{
                System.out.println("a is lesser than b");
           
        }
    }
 }    



