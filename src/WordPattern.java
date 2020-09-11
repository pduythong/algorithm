import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
290. Word Pattern
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {

        String[] splitStr = str.split(" ");
        Map index = new HashMap();

        if (splitStr.length != pattern.length())
            return false;

        for (int i = 0; i < splitStr.length; i++) {
            if (!Objects.equals(index.put(pattern.charAt(i), i) ,
                    index.put(splitStr[i], i))) return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(binaryPatternMatching("010","amazing"));
    }



  public  static   int binaryPatternMatching(String pattern, String s) {

        String binaryString ="";
        int ans =0;

        for(char c: s.toLowerCase().toCharArray()){
            if(c =='a'
                    || c =='e'
                    || c =='i'
                    || c =='o'
                    || c =='u'){
                binaryString += "0";
            }else{
                binaryString += "1";
            }

        }

        int patLength = pattern.length();

        for(int i =0; i< binaryString.length() ; i++){
            if(isMatch(binaryString.substring(i,patLength), pattern)){
                ans++;
            }

        }


        return ans;

    }



  static   boolean isMatch(String input, String pattern){
        return input == pattern;
    }



}
