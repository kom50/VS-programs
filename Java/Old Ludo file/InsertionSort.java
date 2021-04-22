class InsertionSort {
    public static void main(String []args){
        int []arr = {55, 22, 44, 33, 11};    
        for(int a : arr)
           System.out.print(a+ "  ");
        insertionSort(arr);
        System.out.print("\nSorted array is ");
        for(int a : arr)
           System.out.print(a+ "  ");
    }

    public static void insertionSort(int []arr){
        int temp, j,c = 0;
            System.out.println("\nSorting process : ");
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            c = 0;
            for(j = i - 1; j >= 0 && arr[j] > temp; j--){
                arr[j + 1] = arr[j];
                c++;
            }
            arr[j + 1] = temp;
            for(int a : arr)
           System.out.print(a+ "  ");
           System.out.print("\t "+c);
        
            System.out.println();
        }
    }
}