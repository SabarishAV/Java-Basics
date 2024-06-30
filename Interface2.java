interface Camera{
    void takePicture();

    private void capture(){
        // This method cannot be used by any class which implemets this interface
        // This can be used only in this interface
        // example it can be used in a method in this interface
        System.out.println("Capure");
    }

    default void takeSelfie(){
        // For default method in an interface we can also define the method
        // It is also not necessary to call it
        // It can be just called , called and overriden or not called
        capture();
        System.out.println("Taking selfie");
    }
}
interface PlayStore{
    void downloadApp();
}

class FeaturePhone{
    void call(){
        System.out.println("Calling...");
    }
}

class SmartPhone1 extends FeaturePhone implements Camera,PlayStore{
    @Override
    public void takePicture(){
        System.out.println("Taking picture from SmartPhone");
    }

    @Override
    public void downloadApp(){
        System.out.println("Downloading app from playstore in SmartPhone");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        SmartPhone1 smartphone = new SmartPhone1();
        smartphone.takePicture();
        smartphone.call();
        smartphone.downloadApp();
    }
}
