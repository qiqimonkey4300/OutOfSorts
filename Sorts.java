import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean sorted = false;
    int temp = 0;
    for (int i = data.length; i > 0 && !sorted; i--) {
      sorted = true;
      for (int j = 1; j < i; j++) {
        if (data[j] < data[j - 1]) {
          temp = data[j];
          data[j] = data[j - 1];
          data[j - 1] = temp;
          sorted = false;
        }
      }
    }
  }
}
