class methodOverloading{
    // overloading means creating multiple methods with same name but different arguments
    static void sum(int a){
        System.out.println(a);
    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(float a,float b,float c){
        System.out.println(a+b+c);
    }
    public static void main(String [] args){
        sum(1);
        sum(2,3);
        sum(2.5f,2.5f,2.5f);
        
    }
}