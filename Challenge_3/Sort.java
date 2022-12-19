import java.util.Arrays;
public class Sort{

    void Sort(int array[]) {
    int size = array.length;

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
    int[] array = { 47, 84, 75, 21, 14, 14, 79};
    Sort is = new Sort();
    is.Sort(array);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(array));

    System.out.println("Middel valeue : "+median(array));
        System.out.println("Max valeue : "+max(array));
  }
  
    //middle value of array
    public static int median(int[] array){
        int val = array.length / 2;
        int middle = 0;
        for(int i=0;i<array.length;i++){
            if(i==val){
                middle = array[i];
            }
        }
        return middle;
    }

    //maximum value of array
    public static int max(int[] array){
        int mval = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] > mval){
                mval = array[i];
            }
        }
        return mval;
    }
}