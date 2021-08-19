import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    private ArraySorter arraySorter = new BubbleSort();

    @Test
    void sortAscending_ShouldWorkCorrect(){
        int[] arr = {7,3,2,4,5,9,10,1,6,8};
        arraySorter.sortAscending(arr);
        assertArrayEquals(Constants.sortedAsc,arr);
    }
}
