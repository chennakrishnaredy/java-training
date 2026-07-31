// contructor is a special method in java to assign values to objects 
// contructor name and class name should be same
// there is no return type for contructor including void.
// contructor method will automatically call it self when you create an object for class
class Employee{
         // instance variables
        int  empId;
        String fullName;
        double salary;
        float rating;
    // without parameters
    public Employee(){
        System.out.println("A new Object for class is created");
    }
    // with parameters
    /*
    public Employee(int id,String name,double s,float r){
        empId = id;
        fullName = name;
        salary = s;
        rating = r;
    }*/
   public Employee(int empId,String fullName,double salary,float rating){
    this.empId = empId;
    this.fullName = fullName;
    this.salary = salary;
    this.rating = rating;
   }
    // instance method 
    void Welcome(){
        System.out.println("Employee name: "+ fullName);
    }
    public static void main(String [] args){
        Employee emp1 = new Employee(101,"luffy",20000,9.8f);
        emp1.Welcome();
        Employee emp2 = new Employee(102,"zoro",10000,10f);
        emp2.Welcome();

    }
}