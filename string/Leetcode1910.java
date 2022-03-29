package string;

public class Leetcode1910 {
    public void removeAllOccOfSubstring(String str, String subs) {
        while (str.length() != 0 && str.contains(subs) == true) {
            str = str.replace(subs, "");
        }
        System.out.println("String Afte Remove All Occurrences : " + str);
    }
}
