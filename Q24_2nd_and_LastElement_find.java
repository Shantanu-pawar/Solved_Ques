package Interview_Preperation.CommonQues;

public class Q24_2nd_and_LastElement_find {
    public static void main(String[] args) {

//        ques : find the 2nd smallest element in array : done
//        question : find the last element in array using array shorting : done



        int [] arr = {1, 3, 4 , 5, 2}; // first sort the array by using loop ;
        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i +1 ; j < arr.length; j++) {

                if ( arr[i] > arr[j] ) {  // here all code is same just change the
                    // sign to > for acending or descending order

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // this is for printing descending list
        }

        System.out.println();
        System.out.println(" second Smallest element is : " + arr[1]);

        System.out.println("this is last element for print : ");
        System.out.println(arr[arr.length -1 ]);

        // this is for finding 2nd largest element in array



    }
}
