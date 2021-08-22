public class MergeSort extends AbstractArraySorter {
    @Override
    public void sortAscending(int[] arr) {
        mergeSort(arr);
    }

    private void mergeSort(int[] arr){
        int len = arr.length;
        if(len < 2){
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        for(int i = 0; i < mid; i ++) {
            left[i] = arr[i];
        }
        int[] right = new int[len - mid];
        for(int i = mid; i < len; i++){
            right[i - mid] = arr[i];
        }
        sortAscending(left);
        sortAscending(right);

        merge(arr,left,right);
    }

    private void merge(int[] arr, int[] leftArr, int[] rightArr){
        int ind = 0;
        int leftInd = 0;
        int rightInd = 0;
        while (leftInd < leftArr.length && rightInd < rightArr.length){
            if(leftArr[leftInd] <= rightArr[rightInd]){
                arr[ind++] = leftArr[leftInd++];
            }else {
                arr[ind++] = rightArr[rightInd++];
            }
        }
        while (leftInd < leftArr.length){
            arr[ind++] = leftArr[leftInd++];
        }
        while (rightInd < rightArr.length){
            arr[ind++] = rightArr[rightInd++];
        }
    }
}
