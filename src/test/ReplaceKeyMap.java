package test;

import java.util.HashMap;
import java.util.Map;

public class ReplaceKeyMap {
    /*
    . Give a string and a map, replace all the key in the map that occur in the string with the value of that key

e.g:
text = "Hello [first name] [last name]"
map = {"[first name]": "John", "[last name]": "Smith"}
output: Hello John Smith

     */


    public static void main(String[] args) {
        String text = "Hello [first name] [last name]";
        Map<String, String> map = new HashMap<>();
        map.put("[first name]", "John");
        map.put("[last name]", "Smith");

        text = replace(text, map);
        System.out.println(text);


    }

    public static String replace(String text, Map<String, String> map){
        for (String key : map.keySet()) {
            text = text.replace(key, map.get(key));

        }

        return text;
    }


}
