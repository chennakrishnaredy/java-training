public class JumpingStatements{
    public static void main( String[] args){
        for(int i = 1;i <=5;i++){
            if(i==3){
                System.out.println("Exit ❌❌❌");
                break;
            }
            System.out.println(i);
        }
         for(int i = 1;i <=5;i++){
            if(i==3){
                System.out.println("Skip");
                continue;
            }
            System.out.println(i);
        }
    }
}