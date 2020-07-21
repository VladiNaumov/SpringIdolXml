public class PoeticJuggler extends Juggler {
    private  Poem poem;

    public PoeticJuggler (Poem poem){
        super();
        this.poem = poem;
    }
    public PoeticJuggler(int beanBans , Poem poem){
        super(beanBans);
        this.poem=poem;
    }

    public void perform(){
        super.perform();
        System.out.println("Whilebreciting.... ");
        poem.recite();
    }

}
