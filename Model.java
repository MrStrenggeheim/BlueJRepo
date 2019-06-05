
public class Model implements ModelSchreiber
{
    Liste liste;
    DBLeser leser;
    DBSchreiber schreiber;

    GUISchreiber guiSchreiber;

    public Model()
    {
        liste = new Liste();
        // leser = new Datenbank();
        // schreiber = new Datenbank();

        // guiSchreiber = new GUI();
    }

    public void anmelden(DBLeser _leser, DBSchreiber _schreiber, GUISchreiber _guiSchreiber) {
        leser = _leser;
        schreiber = _schreiber;
        guiSchreiber = _guiSchreiber;
        
        inListe();        
    }
    
    public void inListe() {
        liste = new Liste();
        Datenelement[] feld = leser.dateiAuslesen();
        String text = "";
        for(int i = 0; i < feld.length && feld[i] != null; i++) {
            liste.sortiertEinfuegen(feld[i]);
        }
        int length = liste.laengeGeben();
        for (int i = 0; i < length; i++) {
            text += liste.anfangEntfernen().informationAusgeben() + "\n";
        }
        guiSchreiber.schreiben(text);
    }

    public void schreiben(String name, int score) {
        schreiber.datenSchreiben(name, score);
        inListe();
    }
}
