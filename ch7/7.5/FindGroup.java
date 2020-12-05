import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindGroup{
    public static void main(String[] args) {
        String str = "I want to buy a <Crazy Java>, please contend me ASAP 13500006666" + "Make Friend~, phone number 13611125565"+
        "Sell the computer, phone: 15899903312";
        Pattern p = Pattern.compile("((13\\d)|(15\\d))\\d{8}");
        Matcher m = p.matcher(str);
        
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}