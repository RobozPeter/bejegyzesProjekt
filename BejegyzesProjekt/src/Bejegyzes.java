import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.szerkesztve = LocalDateTime.now();
        this.tartalom = tartalom;
    }

    public String getSzerzo() {
        return szerzo;
    }


    public int getLikeok() {
        return likeok;
    }


    public LocalDateTime getLetrejott() {
        return letrejott;
    }



    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like(){
        this.likeok++;
    }

    @Override
    public String toString() {
        return this.szerzo+"-"+this.likeok+"-"+this.letrejott+
                "\nSzerkesztve:"+this.szerkesztve +"\n"+
                this.tartalom;
    }
}
