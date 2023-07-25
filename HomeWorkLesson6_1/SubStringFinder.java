package HomeWork.DivAcademyTimur.HomeWorkLesson6_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SubStringFinder {
    public static void main(String[] args) {
        String hi="Hello huhu huh";
        String subStr = subString(hi,0,1515);


    }

    static String subString(String s, int startIndex, int endIndex){
        String result = "";
        while(endIndex<=s.length()) {

            char[] array = s.toCharArray();
            String[] charIndex = new String[array.length];
            int index = 0;
            for (char c : array) {
                charIndex[index] = "" + c + " - " + index;
                index++;
            }//Created Char - index relation array for Visual compare
            System.out.println("Your String : \n" + Arrays.toString(array));
            System.out.println();
            System.out.println("String with Character-Index relations: \n" + Arrays.toString(charIndex));
            System.out.println();
            for (int i = startIndex; i <= endIndex; i++) {
                result += array[i];
            }//Getting substring for original String
            System.out.println("you Substring is : " + result);
        }
        return result;
    }

}
