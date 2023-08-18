package Day_04;

public class duyet_mang_2_chieu {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        print(arr, 0, 0);
    }

    private static void print(int[][] arr, int row, int col) {
        if (row >= arr.length) {
            return;
        }
        System.out.print(arr[row][col] + " ");
        if (col + 1 < arr[0].length) {
            print(arr, row, col + 1);
        } else {
            print(arr, row + 1, 0);
        }
    }
}
