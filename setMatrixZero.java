import java.util.ArrayList;
import java.util.Scanner;

public class setMatrixZero {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row of matrix:");
        int rowCount = sc.nextInt();

        System.out.println("Enter the column of matrix:");
        int columnCount = sc.nextInt();

        for (int i = 0; i < rowCount; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                System.out.println("Enter the value for row " + (i + 1) + " and column " + (j + 1));
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        ArrayList<ArrayList<Integer>> ans =  setZero(matrix, rowCount, columnCount);

        System.out.println("Matrix:");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    static ArrayList<ArrayList<Integer>> setZero(ArrayList<ArrayList<Integer>> matrix, int row, int column) {
        for(int i = 0; i< row; i++){
            for (int j = 0; j < column; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRow(matrix, i, row);
                    markColumn(matrix, j, column);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(matrix.get(i).get(j) == -1)
                    matrix.get(i).set(j, 0);
            }
        }

        return matrix;
    }

    static void markRow(ArrayList<ArrayList<Integer>> matrix, int row, int maxRow) {
        for (int i = 0; i < maxRow; i++) {
            if(matrix.get(row).get(i) != 0)
                matrix.get(row).set(i, -1);
        }
    }

    static void markColumn(ArrayList<ArrayList<Integer>> matrix, int column,int maxColumn) {
        for (int i = 0; i < maxColumn; i++) {
            if(matrix.get(i).get(column) != 0)
                matrix.get(i).set(column, -1);
        }
    }

}
