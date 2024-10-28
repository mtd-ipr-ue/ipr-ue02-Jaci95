import libraries.In;
import libraries.Out;

public class ue02_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Out.println("Gib die Erste Zahl ein: ");
        int ZahlEins = In.readInt();

        Out.println("Gib die Zweite Zahl ein: ");
        int ZahlZwei = In.readInt();

        Out.println("Gib die Dritte Zahl ein: ");
        int ZahlDrei = In.readInt(); 

if (ZahlEins <= ZahlZwei && ZahlZwei <= ZahlDrei) {
    Out.print("groesste Zahl ist: " + ZahlDrei);
} else if (ZahlZwei <= ZahlDrei && ZahlDrei <= ZahlEins) {
    Out.print("groesste Zahl ist: " + ZahlEins);
} else if (ZahlDrei <= ZahlZwei && ZahlEins <= ZahlZwei) {
    Out.print("groesste Zahl ist: " + ZahlZwei); }
    }}
