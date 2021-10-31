public class SPIELER implements Datenelement{
    
    private String name;
    private int highscore;    
    
    public SPIELER(String nameNeu, int hsNeu){
        this.name=nameNeu;
        this.highscore=hsNeu;
    }
    
    public String informationAusgeben(){
        return "Name: " + this.name + " Highscore: " + this.highscore;
    }
    
    public boolean istKleinerAls(Datenelement e){
        SPIELER vergleich=(SPIELER) e;
        if(this.highscore<vergleich.nenneHighscore()){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean schluesselIstGleich(String vergleich){
        return this.name.compareTo(vergleich) == 0;
    }
    
    public int nenneHighscore(){
        return this.highscore;
    }
    
    public String nenneName(){
        return this.name;
    }


}
