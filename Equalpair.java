import java.util.ArrayList;
import java.util.Scanner;

public class Equalpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row count");
        int n = sc.nextInt();

        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
           
        }

        int ans = equalPair(grid);
        System.out.println(ans);

        sc.close();
    }

    static ArrayList<String> getRowList(int[][] grid) {
        ArrayList<String> rowList = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            String row1 = "";
            for (int j = 0; j < grid[i].length; j++) {
                row1 += grid[i][j];
            }
            System.out.println(row1);
            rowList.add(row1);
        }


        return rowList;
    }

    static ArrayList<String> getColList(int[][] grid) {
        ArrayList<String> columnList = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            String columnData = "";
            for (int j = 0; j < grid.length; j++) {
                columnData += grid[j][i];
            }
            System.out.println(columnData);
            columnList.add(columnData);
        }

        return columnList;
    }

    static int equalPair(int[][] grid) {
        ArrayList<String> rowList = getRowList(grid);
        ArrayList<String> columnList = getColList(grid);

        int ctr = 0;

        for (int i = 0; i < grid.length; i++) {
           for (int j = 0; j < grid.length; j++) {
            System.out.println("row list: " + rowList.get(i) + " column list: " + columnList.get(j) + "");
             if (columnList.get(i).equals( rowList.get(j))) {
                
                 ctr++;
             }
           }
        }

        return ctr;
    }
}
