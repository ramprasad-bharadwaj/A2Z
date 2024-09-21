public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        SelectionSort s = new SelectionSort();
        s.printArray(arr);
        s.sort(arr);
        s.printArray(arr);
    }

    void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){

            int min_index = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
