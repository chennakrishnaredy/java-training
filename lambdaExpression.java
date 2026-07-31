import java.util.*;

@FunctionalInterface
interface Greetings{
    public void welcome();
 }
 @FunctionalInterface

interface DisplayInfo{
public void userInfo(String name);
}
@FunctionalInterface
interface Square   {
    public void sq(int n);    
}
@FunctionalInterface

interface Add {
    public int sumOfTwo(int a,int b); 
}
@FunctionalInterface
 interface  LargestNum {
    public int maximumOfTwo(int a,int b);
}
public class lambdaExpression {
    // lambda is used to bring functional programming to java
    // Lambda means anonymous function 
    // a Function without a name
    // syntax (parameters) -> expression
    // if the lambda method have single line no need to use return it will automaticaly return by jvm and also no need to use {}
    // if you want write more than one line we return and {} for lambda.
    public static void main(String[] args) {
    //    ** Functional interface contains only one abstract method without defination and we can right any no of static methods or default methods 
    // 1.without parameters
    Greetings mess = ()  -> System.out.println("Welcome Functional  Interface");
    mess.welcome();
      // 2.with one parameter
    DisplayInfo user = (name) -> System.out.println(
        "Welcome Mr. "+name
    );
    user.userInfo("Luffy");
    // square of number
    Square res = (n) -> System.out.println(n*n);
    res.sq(100);
    res.sq(10);
    // sum of two num
    Add result = (a,b )-> a+b;
    System.out.println(result.sumOfTwo(5, 10));
    // largest num
    LargestNum max = (a,b) -> a>b?a:b;
    System.out.println(max.maximumOfTwo(10,20));
    }
}
