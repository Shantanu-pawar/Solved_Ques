package Interview_Preperation.CommonQues;

public class Q15_Print_Single_ELEMENT_FromArray {
    public static void main(String[] args) {
        /*
        associative laws
        Q15_Print_Single_ELEMENT_FromArray follows associative property

        commutative property :
        a + b = b + a
        a * b = b * a

        associative property :
        (a * b) * c = a * ( b * c)
        (a + b) + c = a + ( b + c)

        XOR properties that how it basically returns the elements

            0 | 0 = 0
            0 | 1 = 1
            1 | 1 = 0
            1 | 0 = 1

        in this it basically provide output of non
        repetitive elements but only gives one element if we give two single nums then
        it returns the sum of it.

        steps for this question :
        1. crete array
        2. result variable
        3. for loop
         */

        int []arr = {1, 2, 3, 2, 3, 1, 7, 7};

//        here whatever the total nos it returns the sum in final output
//        like above ex :  11 is single no so it return the sum of it

        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {

        answer = answer ^ arr[i] ;

        }

        System.out.println( "single element is : " + answer);
    }
}
