class Father{
    static void house(){
        System.out.println("Father have a property called house:🏠");
    }
}
// extends to inherit properties and methods
class Son extends Father{
    void bike(){
        System.out.println("son have a bike 🚲");
    }
}
class Grandchild extends Son{
    void Gold(){
        System.out.println("Grandchild have gold: ");
    }
}
class Singleinheritance{
   public static void main(String [] args){
     Son s = new Son();
    s.house();
    s.bike();
    Grandchild gc = new Grandchild();
    gc.house();
    gc.bike();
    gc.Gold();
    // Father f = new Father();
    // f.bike();
   }
}