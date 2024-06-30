
class Base{
    Base(){
        System.out.println("I'm a base constuctor");
    }
    Base(int a){
        System.out.println("I'm a base constuctor with value " + a);
    }
}

class Derived extends Base{
    Derived(){
        super(3); // If this is line is not there, the the Base constructor with no arguments would have run
        System.out.println("I'm a derived class constructor");
    }
}

public class super_keyword {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}
