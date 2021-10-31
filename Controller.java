public class Controller implements ControllerSchreiber
{
    private ModelSchreiber mSchreiber;
    private GUISchreiber guiSchreiber;
    public Controller() {
        
    }
    
    // hier wird angemeldet für dein schreiber martin
    public void anmelden(ModelSchreiber mSchreiber, GUISchreiber guiSchreiber) {
        this.mSchreiber = mSchreiber;
        this.guiSchreiber = guiSchreiber;
    }
    
    public void neuerSpieler(String name, int score) {
        if (name.equals("test ")) {
            guiSchreiber.invalidName(name);
        } else {
            mSchreiber.schreiben(name, score);
        }
        try{
            mSchreiber.schreiben(name, score);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
