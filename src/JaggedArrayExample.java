import java.util.Scanner;
public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Input: number of rows
        System.out.print("Enter number of rows for the jagged array: ");
        int rows = sc.nextInt();
// Declare jagged array
        int[][] jaggedArray = new int[rows][];
// Input: define number of columns for each row and take values
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];
// Input values for current row
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }// Output: print the jagged array
        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}