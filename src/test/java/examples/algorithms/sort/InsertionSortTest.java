package examples.algorithms.sort;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest
{

  @org.junit.jupiter.api.Test
  void sort()
  {
    int[] input = {2,1,5,4};
    int[] expected = {1,2,4,5};
    InsertionSort insertionSort = new InsertionSort();
    int[] output = insertionSort.sort(input);

    assertArrayEquals(expected,output);
  }
}