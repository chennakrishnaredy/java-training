public class Staticmethods{
    // 1.method without any data
    static void Greetings(){
            System.out.println("Welcome to Java");
        }
    // 2.method with parameters 
    static void CalcAge(int birthYear){
        System.out.println(2026 - birthYear);
    }
    // 3. methods with return type
    static int SumOfTwo(int a,int b){
        return a+b;
    }
    static String  Fullname(String firstName,String lastName){
        return firstName+lastName;
    }
    // variable length arguments
    static void VariableLengthArg(int ...num){
        int sum = 0;
        for(int n:num){
            sum += n;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        // calling function or invoking function call
        Greetings();
        Greetings();
        CalcAge(2000);
       System.out.println( SumOfTwo(2,5));
    //    better option to receive data from func return
        String result = Fullname("MonkeyD","Luffy");
        System.out.println(result);
        VariableLengthArg();
        VariableLengthArg(10,20);
        VariableLengthArg(10,20,30);
    }    
}