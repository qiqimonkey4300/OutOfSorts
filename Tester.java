import java.util.Random;
import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
      int[] a = new int[] {5, 1, 12, -5, 16};
      System.out.println(Arrays.toString(a));
      Sorts.bubbleSort(a);
      System.out.println(Arrays.toString(a));
      System.out.println();
      int[] a1 = new int[] {5, 1, 12, -5, 16};
      System.out.println(Arrays.toString(a1));
      Sorts.selectionSort(a1);
      System.out.println(Arrays.toString(a1));

      System.out.println();

      int[] b = new int[] {2, 3, 4, 5, 1};
      System.out.println(Arrays.toString(b));
      Sorts.bubbleSort(b);
      System.out.println(Arrays.toString(b));
      System.out.println();
      int[] b1 = new int[] {2, 3, 4, 5, 1};
      System.out.println(Arrays.toString(b1));
      Sorts.selectionSort(b1);
      System.out.println(Arrays.toString(b1));

      System.out.println();

      int[] c = new int[] {6, 1, 2, 3, 4, 5};
      System.out.println(Arrays.toString(c));
      Sorts.bubbleSort(c);
      System.out.println(Arrays.toString(c));
      System.out.println();
      int[] c1 = new int[] {6, 1, 2, 3, 4, 5};
      System.out.println(Arrays.toString(c1));
      Sorts.selectionSort(c1);
      System.out.println(Arrays.toString(c1));

      System.out.println();

      //Empty array
      int[] d = new int[] {};
      System.out.println(Arrays.toString(d));
      Sorts.bubbleSort(d);
      System.out.println(Arrays.toString(d));
      System.out.println();
      int[] d1 = new int[] {};
      System.out.println(Arrays.toString(d1));
      Sorts.selectionSort(d1);
      System.out.println(Arrays.toString(d1));

      System.out.println();

      //Repetition
      int[] e = new int[] {1, 2, 3, 3, 6, 5, 4};
      System.out.println(Arrays.toString(e));
      Sorts.bubbleSort(e);
      System.out.println(Arrays.toString(e));
      System.out.println();
      int[] e1 = new int[] {1, 2, 3, 3, 6, 5, 4};
      System.out.println(Arrays.toString(e1));
      Sorts.selectionSort(e1);
      System.out.println(Arrays.toString(e1));
  }
}
