public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Insertion_Sort i = new Insertion_Sort();
        i.printArray(arr);
        i.sort(arr);
        i.printArray(arr);
    }

    void sort(int[] arr){
        int n = arr.length;
        for(int  i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
