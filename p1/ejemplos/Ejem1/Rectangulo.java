package p1.ejemplos.Ejem1;

// traduccion para ver como hacer el traductor codeGenerator

public class Rectangulo {
    
    public static void main(String[] args) {
        if(args.length < 3) {
            return;
        }

        int ancho = Integer.parseInt(args[1]);
        int alto = Integer.parseInt(args[2]);

        // vars es variables locales del programa fuente

        int i = 0;
        
        // size
        int array[][] = new int[ancho+10][alto+10];
        
        for (int j=0; j < ancho+10; j++) {
            for (int k=0; k < alto+10; k++) {
                array[j][k] = 0;
            }
        }

        while (i < ancho) {
            //rellenar pixeles
            array[i+5][5] = 2; // es 2 porque el 2 es negro
            array[i+5][alto+4] = 2;
            i++;
        }

        i = 0;

        while (i < alto) {
            array[5][i+5] = 2;
            array[ancho+4][i+5] = 2;
            i++;
        }
    }

    //convertir una array 2d a 1d para cualqueir array bidimensional generico
    //hacer una clase especifica para esto

    public int[] 2DarrayTo1D (int array[][]) { //array[y][x]

        // limite del primer for es la fila mas alta del array  
        for (int i = /*array upper limit*/; i < ;i--) {
            // limite del segundo for es la columna mas baja
            for (int j = 0; j < /*array upper limit*/;j++) {

            }
        }
    }
}
