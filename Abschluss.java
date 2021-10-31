
public class Abschluss extends Listenelement
{
  
    public Abschluss(){}

    public Listenelement hintenEinfuegen(Datenelement neu){
        return new Knoten(neu,this);
    }

    public Listenelement einfuegenVor(Datenelement neu, Datenelement vor){
        return new Knoten(neu,this);
    }

    public Listenelement sortiertEinfuegen(Datenelement neu){
        return new Knoten(neu,this);
    }

    public Datenelement endeGeben(Datenelement d){
        return d;
    }

    public Listenelement entfernen(){
        return null;
    }

    public Datenelement nenneDatenelement(){
        return null;
    }

    public Datenelement suchen(String name){
        return null;
    }

    public String informationAusgeben(int maxAnz){
       return ""; 
    }

    public int restlaengeGeben(){
        return 0;
    }

    public boolean istInRestliste(String name){
        return false;
    }

}
