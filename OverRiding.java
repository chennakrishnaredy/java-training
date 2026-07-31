// overriding is a method to redefine the methods that present in parent class
class Father{
    void DisplayName(String name){
        System.out.println("Father name: "+ name);
    }
    void Job(String jobName){
        System.out.println("Father is doing job : "+ jobName);
    }
}
class Son extends Father{
    @Override
    void Job(String jobName){
        System.out.println("Son is doing: "+ jobName);
    }
}
class OverRiding{
    public static void main(String [] args) {
    Father f = new Father();
    f.Job("Government emp");
    Son s = new Son();
    s.DisplayName("Dragon");
    s.Job("Business");
    
}
}