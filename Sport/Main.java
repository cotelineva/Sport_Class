package Sport;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Basketball b1 = new Basketball();
        Fussball f1 = new Fussball();
        Hindernislauf hl1 = new Hindernislauf();
        Hochsprung hs1 = new Hochsprung();
        Leichtathletik l1 = new Leichtathletik();

        List<Sport> s = List.of(b1,f1,hl1,hs1);
        Benutzer b = new Benutzer("Bob", "Riley", s);
        System.out.println(b.kalkuliereZeit());
        System.out.println(b.kalkuliereZeit(l1));
        System.out.println(b.kalkuliereZeit(f1));
        System.out.println(b.kalkuliereDurchschnittszeit());
    }
}
