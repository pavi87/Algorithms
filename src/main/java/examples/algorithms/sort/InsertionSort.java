package examples.algorithms.sort;

/**
 * best case O(n)
 * Worst case O(n2)
 * In place sorting
 * ok for small list. Not good for a large list. Doesn't scale.
 * Good for partially sorted lists.
 */
public class InsertionSort
{
  public int[] sort(int[] input){
    for(int i=0;i<input.length;++i){

      int j = i;

      while(j > 0 && input[j-1]>input[j]){

        int key = input[j];
        input[j] = input[j-1];
        input[j-1] = key;
        j = j-1;

      }
    }

    return input;
  }

}
