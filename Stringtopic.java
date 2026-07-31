class Stringtopic{
    public static void main(String [] args){
        // 1 way to create Strings
        String person = "rk";
        // 2 way to create Strings
        String fav = new String("onepiece");
        System.out.println(person +" favarite series is "+ fav);
        // System.out.println(fav[0]);
        // methods
        System.out.println(fav.charAt(0));
        System.out.println(fav.charAt(3));
        System.out.println(fav.charAt(fav.length()-1));
        // indexOf will return first occurance if value is found and if not found -1
        System.out.println(fav.indexOf("i"));
        System.out.println(fav.indexOf("e"));
        System.out.println(fav.indexOf("z"));
        System.out.println(fav.lastIndexOf("e"));
        String sn = "      hello     ";
        System.out.println(sn.trim());
        System.out.println(fav.startsWith("one"));
        System.out.println(fav.endsWith("one"));
        System.out.println(fav.concat(" is gretest story ever"));
        System.out.println(fav.replace("onepiece","dragonball"));
        System.out.println(fav.replace("onepiece","dragonball"));
        System.out.println("dragonball".toUpperCase());
        
    }
}