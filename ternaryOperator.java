import java.util.Scanner;
class ternaryOperator{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ?");
        int age = sc.nextInt();
        String result = age>=18?"Your eligible to apply voter card":"Your not eligible to apply voter card";
        System.out.println(result);
        int a = sc.nextInt();
        int b= sc.nextInt();
        String c = a > b?"a is big":"b is big";
        System.out.println(c);
    }
}