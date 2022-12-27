package nomer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {

        String input = "A 129 AA|92";
        Pattern pattern = Pattern.compile("(92)");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.find();
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");
    }
}

