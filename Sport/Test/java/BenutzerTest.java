import Sport.*;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        Basketball b = new Basketball();
        Hochsprung h = new Hochsprung();
        List<Sport> s = List.of(b,h);
        Benutzer b1 = new Benutzer("x","y", s);
        assertEquals(b1.kalkuliereZeit(), 75.0);
    }

    @Test
    void testKalkuliereZeit() {

        Mannschaftssport m = new Mannschaftssport();
        List<Sport> s = List.of(m);
        Benutzer b1 = new Benutzer("x","y", s);
        assertEquals(b1.kalkuliereZeit(m), 60.0);
    }

    @Test
    void kalkuliereDurchschnittszeit() {
        Fussball f = new Fussball();
        Basketball b = new Basketball();
        Hindernislauf h = new Hindernislauf();
        List<Sport> s = List.of(f,h,b);
        Benutzer b1 = new Benutzer("x","y", s);
        assertEquals(b1.kalkuliereDurchschnittszeit(), 50.0);
    }
}