
public class Knoten extends Listenelement
{
    Datenelement daten;
    Listenelement nachfolger;

    public Knoten(Datenelement datenNeu, Listenelement nNeu){
        this.daten=datenNeu;
        this.nachfolger=nNeu;

    }

    public Knoten hintenEinfuegen(Datenelement neu){
        nachfolger=nachfolger.hintenEinfuegen(neu);
        return this;
    }

    public Listenelement einfuegenVor(Datenelement neu, Datenelement vor){
        if(daten!=vor){  
            nachfolger=nachfolger.einfuegenVor(neu, vor);
            return this;
        } 
        Knoten kNeu=new Knoten(neu,this);
        return kNeu;
    }

    public Listenelement sortiertEinfuegen(Datenelement neu){
        if(daten.istKleinerAls(neu)){
            return new Knoten(neu,this);
        }
        nachfolger=nachfolger.sortiertEinfuegen(neu);
        return this;
    }

    public Datenelement endeGeben(Datenelement d){
        return nachfolger.endeGeben(this.daten);
    }

    public Listenelement entfernen(Datenelement d){
        if(this.daten==d){
            return nachfolger;
        }
        nachfolger=nachfolger.entfernen(d);
        return this;
    }

    public Datenelement nenneDatenelement(){
        return this.daten;
    }

    public Datenelement suchen(String name){
        if(daten.schluesselIstGleich(name)){
            return daten;
        }
        return nachfolger.suchen(name);
    }

    public String informationAusgeben(int maxAnzahl){
        if(maxAnzahl>0){
            return this.daten.informationAusgeben()
            + "\n " + nachfolger.informationAusgeben(maxAnzahl-1);
        }else{
            return "";
        }
    }

    public int restlaengeGeben(){
        return nachfolger.restlaengeGeben()+1;
    }

    public boolean istInRestliste(String name){
        if(this.daten.schluesselIstGleich(name)){
            return true;
        }
        return this.nachfolger.istInRestListe(name);
    }

}
