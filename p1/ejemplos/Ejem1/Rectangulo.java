package p1.ejemplos.Ejem1;
// traduccion para ver como hacer el traductor codeGenerator
import GeneratedCodeLib.*;
public class Rectangulo {
    
    public static void main(String[] args) {
        if(args.length < 3) {
            return;
        }

        int ancho = Integer.parseInt(args[1]);
        int alto = Integer.parseInt(args[2]);

        //if ancho o alto es negativo, sys.err.println("error") y return
        if(ancho < 0 || alto < 0) {
            System.err.println("Error: ancho o alto negativo");
            return;
        }

        // vars es variables locales del programa fuente

        int i = 0;
        
        // size
        int array[][] = new int[ancho+10][alto+10];
        
        // inicializar a 0
        for (int j=0; j < ancho+10; j++) {
            for (int k=0; k < alto+10; k++) {
                array[j][k] = 0;
            }
        }

        while (i < ancho) {
            //rellenar pixeles
            array[i+5][(alto - 1)-(5)] = 2; // es 2 porque el 2 es negro
            array[i+5][(alto - 1)-(alto+4)] = 2;
            i++;
        }

        i = 0;
    //i = alto - 1; 
        while (i < alto) {
            array[5][(alto - 1)-(i+5)] = 2;// array[5][(alto - 1) - i - 5 ] = 2;
            array[ancho+4][(alto - 1)-(i+5)] = 2;
            i++;
        }

        int[] flatArray = Flatt_Array.flatten2DArray(array);

        BMP_Gen.map2BMP(alto, ancho, flatArray, "Rectangulo");
    }
}
    


