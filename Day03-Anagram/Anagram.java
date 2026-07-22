
import java.util.Arrays;


public class Anagram{

    public static void main(String [] args){
        
        String str1 = "listen";
        String str2 = "silent";

        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}