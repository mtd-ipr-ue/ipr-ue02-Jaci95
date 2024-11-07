import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.print("gebe eine x Koordinate ein: ");
        double x = In.readDouble();

        Out.print("Gebe eine y Koordinate ein: ");
        double y = In.readDouble();

        int r = 4;

        double z = Math.sqrt((x*x) + (y*y));

        if(z >= r && y <= 4 && x <= 4 && y >= 0 && x >= 0){
            Out.print("Koordinate innerhalb des grünen Bereichs!");
        } else{
            Out.print("Fehler!! Koordinate nicht innerhalb des grünen Bereichs!");
        }
    }
}
