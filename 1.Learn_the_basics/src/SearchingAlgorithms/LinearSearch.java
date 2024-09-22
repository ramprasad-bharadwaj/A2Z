package SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {90, 24, 68, 1, 6, 89, 100};
        LinearSearch l = new LinearSearch();
        l.printArray(arr);
        int pos = l.search(arr, 1);
        System.out.println("Element found at position " + pos);
    }

    int search(int[] arr, int key){
        int pos;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key)
                return i+1;
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
