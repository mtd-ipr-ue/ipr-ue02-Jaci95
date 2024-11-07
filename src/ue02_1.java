import libraries.In;
import libraries.Out;

public class ue02_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Out.println("Gib die Erste Zahl ein: ");
        int NumberOne = In.readInt();

        Out.println("Gib die Zweite Zahl ein: ");
        int NumberTwo = In.readInt();

        Out.println("Gib die Dritte Zahl ein: ");
        int NumberThree = In.readInt(); 

if (NumberThree >= NumberTwo && NumberThree >= NumberOne) {
    Out.print("Groesste Zahl ist: " + NumberThree);
} else if (NumberOne >= NumberTwo && NumberOne >= NumberThree) {
    Out.print("Groesste Zahl ist: " + NumberOne);
} else if (NumberTwo >= NumberThree && NumberTwo >= NumberOne) {
    Out.print("Groesste Zahl ist: " + NumberTwo); }
    }}
