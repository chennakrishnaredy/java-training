class Device{
    public  void PowerOn(){
        System.out.println("Device is started");
    }
}
// we super keyword to call properties sntax super()
// we super keyword to call methods sntax super.methodname();

class Laptop extends Device{
    public void  deviceName(String name){
        super.PowerOn();
        System.out.println("laptop name: "+ name);
    }
}
class Desktop extends Device{
    void deviceName(String name){
        super.PowerOn();
        System.out.println("Desktop name: "+ name);
    }
}
class Demo{
    public static void main(String [] args){
        // laptop object
        Laptop hp= new Laptop();
        // hp.PowerOn();
        hp.deviceName("dell");
        // desktop object
        Desktop ds = new Desktop();
        // ds.PowerOn();
        ds.deviceName("hp");
    }
}