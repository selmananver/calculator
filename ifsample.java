import java.util.Scanner;

/**
 * ifsample
 */
public class ifsample {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Number is lesser");
        }
        else{
            System.out.println("Number is greater");
        }
    }


}
