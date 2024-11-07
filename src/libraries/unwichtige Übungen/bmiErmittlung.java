import libraries.In;
import libraries.Out;


public class bmiErmittlung {
    public static void main(String[] args) throws Exception {
        Out.println("Gib deine Koerpergroesse in cm ein:");
        int height = In.readInt();
        
        Out.println("Gib dein Köpergewicht in kg ein:");
        int weight = In.readInt();
        
        float bmi = weight / ((height/100f) * (height/100f));
        
        Out.print("BMI: ");
        Out.println(bmi);

        if (bmi < 18.5 ) {Out.println("Untergewicht");
        } else if (bmi >= 25) {Out.println("Übergewichtig");            
        } else {
        Out.print("Normalgewichtig");}}}
        
        
        