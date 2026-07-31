public class Typecasting{
    public static void main(String[] args){
        // byte -- short--int--long--float--double
        // widening (automatic by jvm)
        /*
        int a  = 20;
        // a = 5.2;
        float f = a;
        System.out.println("a value is :"+a);
        System.out.println("f value is :"+f);
        short s = 12;
        int x = s;
        System.out.println(s+"\t"+x);
        // float f = 1.2f;
        // int y = f;
        short s2 = 120;
        double z = s2;
*/
// norrowing conversion or manual
// double--float--long--int--short--byte
double a = 4.5d;
int i = (int) a;
System.out.println(a+"\t"+i);
float f = 1.2f;
        int y =(int) f;
System.out.println(f+"\t"+y);

    }
}