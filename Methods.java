public class Methods{
    // method
    static void Welcome(){
        System.out.println("Welcome to java methods");
    }
    // with parameters and arguments
    static void Display(String name,int age,int rollnumber){
        System.out.println(name +" is "+ age + " old " + "his roll number "+ rollnumber);
    }
    public static void main(String[] args){
        // calling methods or  invoking methods 
        Welcome();
        Welcome();
        Welcome();
        Display("Luffy",19,27);
    }
}