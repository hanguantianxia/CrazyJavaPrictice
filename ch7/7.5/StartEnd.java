import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static void main(String[] args) {
        String regStr = "Java is very easy!";

        System.out.println("Target String is:" + regStr);

        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(regStr);
        while (m.find()) {
            System.out.println(m.group()+ "Sub string start is :" + m.start() + " Sub String end is: " + m.end());
        }
    }
}
