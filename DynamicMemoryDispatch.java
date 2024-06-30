class Phone{
    void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    void on(){
        System.out.println("Turning on Smartphone");
    }
    void selfie(){
        System.out.println("Opening selfie camera");
    }
}

public class DynamicMemoryDispatch {
    public static void main(String[] args) {
        Phone phone = new SmartPhone(); // phone is the object of smartphone and not phone
//        SmartPhone phone = new Phone(); This is not allowed
        phone.on();
//        phone.selfie(); This wont work
    }
}
