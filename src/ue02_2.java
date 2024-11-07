import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Gib die Jahreszahl ein: ");
        int Jahreszahl = In.readInt();
        Out.println("Gib ein Monat in Zahlenform (1-12) ein: ");
        int Monat = In.readInt();
    

    switch (Monat){ 
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        System.out.println("31"); 
        break;
        case 4:
        case 6:
        case 9:
        case 11:
        System.out.println("30");
        break;
        case 2:
        if (Jahreszahl%4==0 && (Jahreszahl%100!=0 || Jahreszahl%400==0)){System.out.println("29");}
        else System.out.println("28");
     
}}}
