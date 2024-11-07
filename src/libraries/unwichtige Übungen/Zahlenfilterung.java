import libraries.In;
import libraries.Out;

public class Zahlenfilterung {
    public static void main(String[] args) throws Exception {
        Out.println("Gib 3 mal eine ganze Zahlen ein:");
        int Zahl1 = In.readInt();
        int Zahl2 = In.readInt();
        int Zahl3 = In.readInt();

        String GeradeZahlen;
        if (Zahl1%2==0) {
            System.out.println("Gerade Zahl: " + Zahl1);
        } if (Zahl2%2==0) {
            System.out.println("Gerade Zahl: " + Zahl2);
        } if (Zahl3%2==0) {
            System.out.println("Gerade Zahl: " + Zahl3);        
        }
        }
    }