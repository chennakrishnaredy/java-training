class Employee{
    int id;
    String name;
    double salary;
    public Employee(int id,String name,double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void Display() {
        System.out.println("Employee name and his salary "+ salary);
    }
}
class Developer extends Employee{
    double bonus;
    public Developer(int id,String name,double salary,double
    bonus){
        super( id,name,salary);
        this.bonus = bonus;
    }
    void TotalSalary(){
        System.out.println("Total salary with bonus: " +salary+bonus);
    }
}
class ExampleSingle{
    public static void main(String[] args){{
        Developer dev =new Developer(101,"akhil",20000,5000);
        dev.Display();
        dev.TotalSalary();

    }}
}