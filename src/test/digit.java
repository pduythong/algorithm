package test;

import java.lang.reflect.AccessibleObject;

public class digit {

    public static void main(String[] args) {
        System.out.println(binaryPatternMatching("010","amazing"));

    }

    public static   boolean match(String pat, String s){
        return pat.equals(s);

    }

    public static   int binaryPatternMatching(String pattern, String s) {

        StringBuilder biString = new StringBuilder();
        for( char c: s.toLowerCase().toCharArray()){
            if(c == 'a'||
                    c == 'o'||
                    c == 'e'||
                    c == 'i'||
                    c == 'u'||
                    c == 'y'){
                biString.append("0");

            }else{
                biString.append("1");
            }

        }
        int patLen = pattern.length();
        int ans =0;

        for(int i =0; i < biString.length();i++){
            if(patLen+i== biString.length()) break; ;
            String sub = biString.substring(i, patLen+i);


            if(match(sub,pattern)){
                ans++;
            }
        }

        return ans;

    }




    public static int digitsManipulations(int n) {

        int sum =0;
        int mul =1;


        while(n !=0){
            sum += n%10;
            mul *= n%10;
            n=n/10;

        }

        System.out.println(sum);
        System.out.println(mul);

        return sum+mul;

    }

}
