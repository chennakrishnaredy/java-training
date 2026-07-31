import java.util.Scanner;
public class Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String firstName = sc.next();
        System.out.println("Enter your last name:");
        String lastName = sc.next();
        System.out.println("Enter your Rollnumber: ");
        int rollNumber = sc.nextInt();
        System.out.println("FullName: "+firstName+lastName);
        System.out.println("Rollnumber: "+" "+rollNumber);


    }
}