import javax.sound.midi.Instrument;

public class Instrumentalist implements Performer{

    public Instrumentalist(){}



    private String song;


    public void setSong(String song){
        this.song = song;
    }

    public String getSong(){
        return song;
    }

    public String screamSong(){
        return song;
    }

    private Instrument instrument;


    public void setInstrument(Instrument insrument){
        this.instrument = insrument;
    }

    public void perform() {

    }
}
