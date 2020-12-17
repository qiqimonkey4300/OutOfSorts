import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean sorted = false;
    int temp = 0;
    while(!sorted) {
      sorted = true;
      for (int i = 1; i < data.length; i++) {
        if (data[i] < data[i - 1]) {
          temp = data[i];
          data[i] = data[i - 1];
          data[i - 1] = temp;
          sorted = false;
        }
        //System.out.println(Arrays.toString(data));
      }
    }
  }
}
