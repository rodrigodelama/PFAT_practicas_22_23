package p1.ejemplos.Ejem1.GeneratedCodeLib;

public class Flatt_Array {

    //convertir una array 2d a 1d para cualqueir array bidimensional generico
    //hacer una clase especifica para esto
    public static int[] flatten2DArray(int[][] array2D) {
        int rows = array2D.length;
        int cols = array2D[0].length;
        int[] flatArray = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatArray[k++] = array2D[i][j];
            }
        }
        return flatArray;
    }
}
