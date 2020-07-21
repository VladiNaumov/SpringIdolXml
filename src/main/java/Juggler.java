
public class Juggler implements Performer {

    public int beanBags = 3;

    public Juggler(){ }

    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BENBAGS");

    }
}

