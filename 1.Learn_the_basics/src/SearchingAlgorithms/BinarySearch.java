package SearchingAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {20, 40, 60, 80, 100};
        BinarySearch b = new BinarySearch();
        b.printArray(arr);
        int pos = b.search(arr, 100);
        System.out.println("Element found at " + pos);
    }
    int search(int[] arr, int key){
        int pos, low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key)
                return mid + 1;
            else if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
