package Interview_Preperation.CommonQues;
import java.util.*;

public class Q0_practiceMch_remove_Duplicate_elements {
    public static void main(String[] args) {
//       remove all duplicate elements if any problem Reffer to smartProgramming

//       by using hashset method this can also give output in unsorted array
//       note this will only remove the repeated numbers

        int []arr = {1, 2, 2, 8, 7 , 8 ,3, 4, 5, 6, 6, 7 };
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length ; i++) {
            hs.add(arr[i]);
        }

        System.out.println(hs);


//          this is only used when there is not asking array format answer

//        for(int no : hs){
//            System.out.print(no + " ");
//        }

    }
}
