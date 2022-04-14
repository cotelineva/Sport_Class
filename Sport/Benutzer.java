package Sport;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport){
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     * @return summe aller dauern aller sporten
     */
    public double kalkuliereZeit(){
        double sum = 0;
        for(Sport x:sport){
            sum += x.kalkuliereZeit();
        }
        return sum;
    }

    /**
     * @param s gegebene sport fur welches wir die dauer kalkulieren
     * @return summe aller minuten
     */
    public double kalkuliereZeit(Sport s){
        /*
        double sum = 0;
        for(Sport.Sport x:sport){
            if(x == s){
                sum += x.kalkuliereZeit();
            }
        }
        return sum;
        */
        return s.kalkuliereZeit();
    }

    /**
     * @return durchschnitt von der dauer jedes sports
     */
    public double kalkuliereDurchschnittszeit(){
        double sum = 0;
        for(Sport x:sport){
            sum += x.kalkuliereZeit();
        }
        return sum/sport.size();
    }
}
