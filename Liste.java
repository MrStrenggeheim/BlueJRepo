
public class Liste
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Listenelement anfang;

    /**
     * Konstruktor für Objekte der Klasse Liste
     */
    public Liste()
    {
        this.anfang=new Abschluss();
    }

    public void vorneEinfuegen(Datenelement neu){
        anfang=new Knoten(neu,anfang);
    }

    public void hintenEinfuegen(Datenelement neu){
        anfang=anfang.hintenEinfuegen(neu);
    }

    public void einfuegenVor(Datenelement neu, Datenelement vor){
        anfang=anfang.einfuegenVor(neu, vor);
    }

    public void sortiertEinfuegen(Datenelement neu){
        anfang=anfang.sortiertEinfuegen(neu);        
    }

    public Datenelement KnotenEntfernen(String suche){
        Datenelement antwort=anfang.suchen(suche);
        System.out.println(antwort.informationAusgeben());
        anfang=anfang.entfernen(antwort);
        return antwort;
    }

    public Datenelement anfangEntfernen(){
        Datenelement antwort=anfang.nenneDatenelement();
        anfang=anfang.entfernen(antwort);
        return antwort;
    }

    public Datenelement endeEntfernen(){
        Datenelement antwort=anfang.endeGeben(null);
        anfang=anfang.entfernen(antwort);
        return antwort;
    }

    public Datenelement suchen(String name){
        return anfang.suchen(name);
    }

    public String informationAusgeben(int maxAnz){
        return anfang.informationAusgeben(maxAnz);
    }

    public int laengeGeben(){
        return anfang.restlaengeGeben();
    }

    public boolean istInListe(String name){
        return anfang.istInRestListe(name);
    }

}
