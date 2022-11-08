import java.util.*;

public class Main {
    public static void main (String[] args){
        String test = "aaxAAbbCcdeeeeF";
        System.out.println(nonRepeatedChar(test));
        System.out.println(nonRepeatedChar2(test));
        System.out.println(nonRepeatedChar3(test));
    }

    public static String nonRepeatedChar(String str) {
        String result = "";
        String[] charArray = str.toLowerCase().split("");

        if(charArray[0].equals(charArray[1])){
            for(int i = 1; i < charArray.length-1; i++) {
                if(!charArray[i].equals(charArray[i-1]) && !charArray[i].equals(charArray[i+1])){
                    result = charArray[i];
                    break;
                }
            }
        } else {
            result = charArray[0];
        }
      return result;
    };

    public static String nonRepeatedChar2(String str){
        String result = "";
        List<String> charArray = Arrays.asList(str.toLowerCase().split(""));

        for(int i = 0; i < charArray.size(); i++) {
            int count = 0;
            for(int j = 0; j < charArray.size(); j++) {
                if(charArray.get(j).equals(charArray.get(i))){
                    count++;
                }
            }
            if(count == 1) {
                result = charArray.get(i);
                break;
            }
        }

      return result;
    };

    public static String nonRepeatedChar3(String str){
        String result = "";
        List<String> charArray = Arrays.asList(str.toLowerCase().split(""));

        for(int i = 0; i < charArray.size(); i++) {
            if(charArray.lastIndexOf(charArray.get(i)) == charArray.indexOf(charArray.get(i))){
                result = charArray.get(i);
                break;
            }
        }

        return result;
    }
}
