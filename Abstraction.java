abstract class Student{
    // static,object  methods
   void Greetings() {
    System.out.print("Welcome to Abstract of Student: ");
   } 
   abstract void Info();
}
class Record extends Student{
    // first we have to write abstract methods in child class
    void Info(){
        int id = 101;
        String name = "ravi";
        String branch = "AIML";
        System.out.println("Student id: "+ id + " Student name: " + name + " Branch is: " + branch);
    }
}
class Abstraction{
    public static void main(String  [] args){
        // Student s = new Student();
        Record r = new Record();
        r.Greetings();
        r.Info();

    }
}