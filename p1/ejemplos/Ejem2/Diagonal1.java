package p1.ejemplos.Ejem2;

public class Diagonal1 {
    public static void main(String[] args) {
        if(args.length < 2) {
            return;
        }

        int lado = Integer.parseInt(args[1]);

        int i = 0;

        int array[][] = new int[lado][lado];
        for (int j=0; j < lado; j++) {
            for (int k=0; k < lado; k++) {
                array[j][k] = 0;
            }
        }

        while (i < lado) {
            array[i][i] = 4; // green is 4
            i++;
        }
    }
}
