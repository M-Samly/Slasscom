import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value ");
        int array[] = new int[7];
        for(int i =0;i<7;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array values");
        for(int i=0;i<7;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

       // median(array);
        //max(array);
        System.out.println("Middel valeue : "+median(array));
        System.out.println("Max valeue : "+max(array));
        System.out.println("Mode valeue : "+mode(array));
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

    
    public static int mode(int[] array){
        int mval = 0;
         int mval1 = 0;
        /*int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] != mval){
                mval = array[i];
            }else if(array[i] == mval) {
                count++;
            }
        }
        System.out.println(count);*/
        for(int i=0;i<array.length;i++){
            mval = array[i];
            if(i != array.length){                
                mval1 = array[i+1];
            }
        }
        return mval;
    }
}

