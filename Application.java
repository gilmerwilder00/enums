import enums.Color;
import enums.DiaSemana;
import modelos.ConvertidorColor;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // actividad1(); // Dias de semana
        actividad2();

        //System.out.println(Arrays.toString(Color.values()));
        
    }

    public static void actividad1(){
        DiaSemana[] diaSemanas = generarDiasAleatoreos();
        
        System.out.println("Dias aleatoreos:");
        System.out.println(Arrays.toString(diaSemanas));

        System.out.println();

        for (DiaSemana diaSemana : diaSemanas) {
            imprimirDiaLaboral(diaSemana);
        } 
        System.out.println();
    }


    public static DiaSemana[] generarDiasAleatoreos(){
        DiaSemana[]  diasGenerados = new DiaSemana[10];

        for(int i = 0; i < 10 ; i++){
            int indice = (int)(Math.random()*DiaSemana.values().length); 
            diasGenerados[i] = DiaSemana.values()[indice]; 
        }

        return diasGenerados;
    }


    public static void imprimirDiaLaboral(DiaSemana dia){
        if(dia.esDiaLaboral()){
            System.out.println(dia + " es un día laboral.");
        }else{
            System.out.println(dia + " NO es un día laboral.");
        }
    }


    public static void actividad2(){
        System.out.println();
        System.out.println("Actividad: Colores");
        System.out.println();
        validaColorPrimario( "#FF0000");
        validaColorPrimario( "#FFFF00");
        validaColorPrimario( "#0000FF");
        validaColorPrimario( "#FF0010");
        validaColorPrimario( "#FF0001");
        System.out.println();

    }

    public static void validaColorPrimario(String valorHezadecimal){

        Color color = ConvertidorColor.convertirHexadecimal(valorHezadecimal);

        if( color != null){
            System.out.println(color);
        }else{
            System.out.println("No es un color primario.");
        }     
    }


}
