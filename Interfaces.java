interface Prey{
    void flee();
}
interface Predator{
    void hunt();
}

class Deer implements Prey{
    @Override
    public void flee(){
        System.out.println("Deer is fleeing from the predator");
    }
}

class Lion implements Predator{
    @Override
    public void hunt(){
        System.out.println("Lion is hunting");
    }
}

class Coyotes implements Prey,Predator{
    @Override
    public void flee(){
        System.out.println("Coyotes are fleeing from large predators");
    }

    @Override
    public void hunt(){
        System.out.println("Coyotes are hunting small animals");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.flee();
        System.out.println();

        Lion lion = new Lion();
        lion.hunt();
        System.out.println();

        Coyotes coyotes = new Coyotes();
        coyotes.flee();
        coyotes.hunt();
    }
}
