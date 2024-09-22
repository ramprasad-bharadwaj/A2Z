public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {67, 34, 23, 90, 12, 37, 10, 77};
        Merge_Sort m = new Merge_Sort();
        m.printArray(arr);
        m.sort(arr, 0, arr.length-1);
        m.printArray(arr);

    }

    void sort(int[] arr, int low, int high){
        if(low < high){
            int mid = low + (high - low)/2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high){
        // len of array
        int len1 = mid - low + 1; // as array starts with index 0
        int len2 = high - mid;

        //temp arrays
        int[] tempLeft = new int[len1];
        int[] tempRight = new int[len2];

        for(int i = 0; i < len1; i++)
            tempLeft[i] = arr[low + i];
        for(int j = 0; j < len2; j++)
            tempRight[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = low;
        // Merging
        while(i < len1 && j < len2){
            if(tempLeft[i] <= tempRight[j]){
                arr[k] = tempLeft[i];
                i++;
            }
            else {
                arr[k] = tempRight[j];
                j++;
            }
            k++;
        }

        while(i < len1){
            arr[k] = tempLeft[i];
            i++;
            k++;
        }

        while(j < len2){
            arr[k] = tempRight[j];
            j++;
            k++;
        }
    }

    void printArray(int[] arr){
        for(int i: arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
