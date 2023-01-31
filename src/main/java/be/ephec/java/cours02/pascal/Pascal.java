package be.ephec.java.cours02.pascal;

public class Pascal {
    public static int[][] triangle(int nrOfLines) {
        if (nrOfLines <= 0) {
            System.out.println("Impossible de créer un triangle de Pasal pour un nombre < 0" + nrOfLines);
            return null;
        }

        int [][] triangle = new int[nrOfLines][];
        triangle[0] = new int[1];
        triangle[0][0] = 1;

        if (nrOfLines > 1) {
            for (int line = 1; line < nrOfLines; line++) {
                triangle[line] = new int [line + 1];
                triangle[line][0] = 1;
                triangle[line][line] = 1;
                for (int cell = 1; cell < line; cell++)
                    triangle[line][cell] = triangle[line - 1][cell - 1] + triangle[line - 1][cell];
            }
        }

        return triangle;
    }
}
