import java.util.Random;
import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
      int[] a = new int[] {5, 1, 12, -5, 16};
      Sorts.bubbleSort(a);

      System.out.println();

      int[] b = new int[] {2, 3, 4, 5, 1};
      Sorts.bubbleSort(b);

      System.out.println();

      int[] c = new int[] {6, 1, 2, 3, 4, 5};
      Sorts.bubbleSort(c);

      System.out.println();

      //Empty array
      int[] d = new int[] {};
      Sorts.bubbleSort(d);
      System.out.println(Arrays.toString(d));

      System.out.println();

      //Repetition
      int[] e = new int[] {1, 2, 3, 3, 6, 5, 4};
      Sorts.bubbleSort(e);
      System.out.println(Arrays.toString(e));
  }
}
