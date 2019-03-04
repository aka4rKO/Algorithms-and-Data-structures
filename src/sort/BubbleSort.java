package sort;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int arr[], int i, int j){

        if(i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
