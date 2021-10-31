public class Controller implements ControllerSchreiber
{
    private ModelSchreiber mSchreiber;
    private GUISchreiber guiSchreiber;
    public Controller() {
        
    }
    
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
