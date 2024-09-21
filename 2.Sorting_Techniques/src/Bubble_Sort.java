public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        Bubble_Sort b = new Bubble_Sort();
        b.printArray(arr);
        b.sort(arr);
        b.printArray(arr);
    }

    void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void printArray(int[] arr){
        for(int i: arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
