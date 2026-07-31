class Students {
    // attributes or instance variable
    String name;
    int age;
    int id;
    // instance methods or object methods
    void Welcome(){
        System.out.println(name);
    }
    public static void main(String [] args){
        Students s1 = new Students();
        s1.name = "zoro";
        s1.age = 27;
        s1.id = 1;
        s1.Welcome();
        Students s2 = new Students();
        s2.name="luffy";
        s2.age=19;
        s2.id = 56;
    }
}