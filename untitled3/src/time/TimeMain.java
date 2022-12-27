package time;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TimeMain {

    public static void main(String[] args) {

        String input = "Завтрак в 15:44";
        Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
