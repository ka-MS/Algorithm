package mergeSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        // given 주어진 값
        MergeSort merge = new MergeSort();
        int[] arr = {3, 1, 4, 2, 6, 5};

        // when 언제
        merge.mergeSort(arr);

        // then 어떤결과
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr);

    }
}