import sort.BubbleSort;

public class Main {

    public static void main(String[] args) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};

        printArr(arr);

        BubbleSort.bubbleSort(arr);

        System.out.println();
        printArr(arr);
    }

    static void printArr(int arr[]) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

}
