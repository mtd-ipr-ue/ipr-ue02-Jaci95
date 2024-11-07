import libraries.In;
import libraries.Out;


public class Temperaturbewertung {
    public static void main(String[] args) throws Exception {
    Out.println("Gib die Temperatur ein:");
    int Temperatur = In.readInt();

    String bewertung;
    
    if (Temperatur > 25) {
    bewertung = "Heiß";
    } else if (Temperatur > 0) {
    bewertung = "Warm";
    } else {
    bewertung = "Kalt";
    }
    System.out.println("Die Temperatur ist: " + bewertung);}}
        
        
        