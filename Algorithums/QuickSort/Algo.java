package Algorithums.QuickSort;

public class Algo {

    public static int Partitation(int[] arr, int low, int high) {
            int pivote = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivote) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            i++;
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            return i;
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {

        int pivoteindex = Partitation(arr, low, high);

        QuickSort(arr, low, pivoteindex - 1);
        QuickSort(arr, pivoteindex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 8, 4, 9, 20, 1 };
        int low = 0;
        int high = arr.length - 1;

        QuickSort(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
