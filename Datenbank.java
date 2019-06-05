import java.io.*;
public class Datenbank implements DBSchreiber, DBLeser
{
    private File db;
    
    public Datenbank()
    {
        db=new File("datenbank.csv");
    }

    /**
     * Liest die aktuellen Datenelemente aus der Datei aus.
     * 
     * @return        Ein Feld der gespeicherten Datenelemente
     */
    public Datenelement[] dateiAuslesen(){
        Datenelement[] antwort=new Datenelement[10000];
        try {
            BufferedReader FileReader=                      //ein Reader um die Datei Zeilenweise auszulesen
                new BufferedReader( new FileReader(db)
                );

            String zeile="";
            int i=0;

            while(null!=(zeile=FileReader.readLine())){         //lesen jeder Zeile  
                String[] split=zeile.split(";");                //hier wird die Zeile zerlegt als Trennzeichen ;
                antwort[i]=new SPIELER(split[0],Integer.parseInt(split[1]));
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return antwort;
    }

    /**
     * Schreibt das Datenelement in die Datenbank
     * 
     * @param  neu    zu schreibendes Datenelement
     */
    public void datenSchreiben(String name,int score) {
        String ausgabe=name+";"+score;
        try{
     
            BufferedWriter buff = new BufferedWriter(new FileWriter("datenbank.csv", db.exists()));
            buff.newLine();
            buff.write( ausgabe);

            buff.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
