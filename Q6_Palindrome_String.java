package Interview_Preperation.CommonQues;


//    palindrome string means after reverse the string it gives same out put
//    like dad = dad (after reverse the string)
//    101  = 101
/*
steps : take 1 string and rev varible
        apply for loop
        apply if else thats it
 */
public class Q6_Palindrome_String {
    public static void main(String[] args) {

        String name = "shantanu ";

        String rev  = "";

        for (int i = name.length() -1 ; i >= 0 ; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev + " :  is reverse of the string.");

        if (name.equals(rev))
        {
            System.out.println(name + " : is palindrome String");
        }else{
            System.out.println(name + " : not a palindrome string ");
        }
    }
}
