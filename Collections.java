import java.util.ArrayList;
class Collections{
    public static void main(String[] args){
        // collections are used to group values into a single variable and the size of the collections are dynamic
        // General Arrays
        String [] lang ={"python","Javascript","java"};
        System.out.println(lang);
        // ArrayList
        ArrayList<String> l = new ArrayList<>();
        System.out.println("Array list: "+ l);
        // adding values
        l.add("English");
        l.add("Telugu");
        l.add("Hindi");
        l.add("Tamil");
          System.out.println(l);
        System.out.println(l.get(1));
        System.out.println(l.get(l.size() -1));
        System.out.println(l.remove(2));
        l.remove(l.size() -1);
        l.set(0,"Hindi");
          System.out.println(l);
        System.out.println(l.contains("Tamil"));
        System.out.println(l.contains("Telugu"));
        l.clear();
          System.out.println(l);
    }
}