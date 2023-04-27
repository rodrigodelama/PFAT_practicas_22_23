// traduccion para ver como hacer el traductor codeGenerator
import GeneratedCodeLib.*;
public class Rectangulo {
    
    public static void main(String[] args) {
        if(args.length != 3) {
            System.err.println("Error: numero de argumentos incorrecto");
            return;
        }
        //inp
        int ancho = Integer.parseInt(args[0]);
        int alto = Integer.parseInt(args[1]);

        //if ancho o alto es negativo
        if((ancho+10) <= 0 || (alto+10) <= 0) {
            System.err.println("Error: ancho o alto negativo");
            return;
        }

        // vars es variables locales del programa fuente
        int i = 0;
        // size
        int array[][] = new int[ancho+10][alto+10];
        int ancho_size = array.length;
        int alto_size = array[0].length;
        // inicializar a 0
        for (int j=0; j < ancho_size; j++) {
            for (int k=0; k < alto_size; k++) {
                array[j][k] = 0;
            }
        }

        while (i < ancho) {
            //rellenar pixeles
            //plot(x,y,color) se debe traducir por array[x][(alto+10-1)-y]= color
            array[i+5][(alto_size-1)-(5)] = 2; // es 2 porque el 2 es negro
            array[i+5][(alto_size-1)-(alto+4)] = 2;
            i++;
        }

        i = 0;
    //i = alto - 1; 
        while (i < alto) {
            //plot(x,y,color) se debe traducir por array[x][(alto+10-1)-y]= color
            //alto +10 porque lo define size!!!
            array[5][(alto_size-1)-(i+5)] = 2;// array[5][(alto - 1) - i - 5 ] = 2;  
            array[ancho+4][(alto_size-1)-(i+5)] = 2; //y es i+5
            i++;
        }

        
        int[] flatArray = Flatt_Array.flatten2DArray(array);
        BMP_Gen.map2BMP(alto_size, ancho_size, flatArray, args[2]);
    }
}
    


