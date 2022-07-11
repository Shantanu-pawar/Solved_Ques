package Interview_Preperation.CommonQues;

public class Q25_InsertElement_In_Array {
    public static void main(String[] args) {


         int []arr = {10, 20, 30, 40, 50, 60, 120};
        int position  = 4;
//        this is position not index value keep in mind
//        and if we want to insert element at index position then remove that (-1) from code
//        just take focus what interviewer asking that
//        he talks about position or index value ;


        int element  = 5555 ;
//        simply here when we add element into array then array's last index is gone


        arr[1] = 11110; // this is just for replacing element.

        for (int i = arr.length-1 ; i > position -1 ; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position - 1] = element;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  "); //Insert the element here
        }


    }
}
