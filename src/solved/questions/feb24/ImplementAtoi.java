package solved.questions.feb24;

/*Given a string, s, the objective is to convert it into integer format without 
utilizing any built-in functions. If the conversion is not feasible, the function should return -1.
Note: Conversion is feasible only if all characters in the string are numeric or if its 
first character is '-' and rest are numeric.*/
public class ImplementAtoi {

    public static void main(String[] args) {
        System.out.println(atoi("1234"));
        System.out.println(atoi("-134"));
        System.out.println(atoi("12b34"));
        System.out.println(atoi("1ac4"));
    }
    public static int atoi(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-')
                continue;
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                return -1;
            ans = ans * 10 + (s.charAt(i) - '0');
        }
        if (s.charAt(0) == '-')
            return -1 * ans;
        return ans;
    }
}
