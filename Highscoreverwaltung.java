
public class Highscoreverwaltung
{
    private Datenbank b;
    private GUI gui;
    private Model m;
    private Controller c;
    

    //sadhufapsodfhasdofh Test
    public Highscoreverwaltung(){
        b=new Datenbank();
        gui=new GUI();
        m = new Model();
        c = new Controller();
        //m=new CONTROLLER((DBlesen)b,(DBschreiben)b,(GUISchreiber) gui, scores);
        m.anmelden(b, b, gui);
        gui.modelSchreiberAnmelden(m, c);
        c.anmelden(m, gui);
        //gui.modelSchreiberAnmelden((ModelSchreiber) m);
    }

    public static void main(String[] args){
        new Highscoreverwaltung();
    }
    
    public void datenSchreiben(String name, int score) {
        b.datenSchreiben(name, score);
    }
    
    public Datenelement[] datenLesen() {
        return b.dateiAuslesen();
    }
}
