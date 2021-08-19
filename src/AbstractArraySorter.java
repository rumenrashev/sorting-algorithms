public abstract class AbstractArraySorter implements ArraySorter {

    protected void swap(int[] arr, int firstInd, int secondInd){
        int temp = arr[firstInd];
        arr[firstInd] = arr[secondInd];
        arr[secondInd] = temp;
    }

}
