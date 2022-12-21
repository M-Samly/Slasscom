import java.util.Arrays;
import java.util.Scanner;

public class Sort {

  // insertion sort
  public void Sort(int array[]) {
    int size = array.length; // Get the array list
    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }
      array[j + 1] = key;
    }
  }

  public static void main(String args[]) {
    // int[] array = { 47, 84, 75, 21, 14, 14, 79 }; //Array values
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value ");F
    int array[] = new int[7];
    for (int i = 0; i < 7; i++) {
      array[i] = sc.nextInt();
    }
    Sort is = new Sort();
    is.Sort(array);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(array));

    System.out.println("Middel valeue : " + median(array));
    System.out.println("Max valeue : " + max(array));
    // System.out.println("Mode valeue : " + mode(array));
    mode(array);
    System.out.println();
    prime(array);
  }

  // middle value of array
  public static int median(int[] array) {
    int val = array.length / 2; // get the lenth of array and devided by 2
    int middle = 0; // intial middle value as zero
    for (int i = 0; i < array.length; i++) {
      if (i == val) { // check if devided value equal to array number
        middle = array[i]; // asing a new value as a middle value
      }
    }
    return middle; // return middle value
  }

  // maximum value of array
  public static int max(int[] array) {
    int mval = 0; // intial maximam value as zero
    for (int i = 0; i < array.length; i++) {
      if (array[i] > mval) { // checking maximum value
        mval = array[i]; // asing a new value as a miximum value
      }
    }
    return mval; // return maximum value
  }

  // mode funtion
  public static void mode(int[] array) {
    int count = 0;
    int temp[] = new int[array.length]; // traverse original array
    for (int i = 0; i < array.length; i++) { // current element
      int element = array[i];
      if (element == temp[count]) { // if already exist then don't check
        continue;
      }
      for (int j = i + 1; j < array.length; j++) { // check occurrence of element
        if (array[j] == element) {
          temp[count++] = element;
          break; // found, therefore break
        }
      }
    }
    System.out.println("Total Repeated elements: " + count); // display total repeated elements
    System.out.print("Repeated elements are: "); // display repeated elements
    for (int i = 0; i < count; i++) {
      System.out.print(temp[i] + " ");
    }
  }

  // prime numbers
  public static void prime(int[] array) {
    int cnt = 0;
    int i = 0;
    int flag = 0;

    for (cnt = 0; cnt < array.length; cnt++) {
      flag = 0;
      for (i = 2; i < array[cnt] / 2; i++) {
        if (array[cnt] % i == 0) {
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(array[cnt] + " - Prime");
      } else {
        System.out.println(array[cnt] + " - Not Prime");
      }
    }
    System.out.println();
  }
}