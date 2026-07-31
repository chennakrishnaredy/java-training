import java.util.Scanner;
public class Conditional{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Postive number: "+num);
        }else{
            System.out.println("Negative number: "+num);
        }
        if (num% 2==0){
            System.out.println("Even number");;
        }else{
            System.out.println("odd number");
        }
    }
}