import java.util.Scanner;

public class forloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int sum =0;
        for(int i=0;i<a;i++){
            sum = sum+i;
        }
        System.out.println("Result:"+sum);

    }
}
