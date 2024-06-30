class Person<P1>{ // additional generics can be added using commas
    String name;
    P1 id;
    Person(String name, P1 id){
        this.name = name;
        this.id = id;
    }
}

public class Generics {
    public static void main(String[] args) {
        Person<Integer> person = new Person("John Cena",1);
        int id = person.id;
        String name = person.name;
        System.out.println(id + ". " + name);
    }
}
