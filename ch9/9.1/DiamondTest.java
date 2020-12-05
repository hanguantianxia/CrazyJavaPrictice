import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondTest{
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("Crazy Java");
        books.add("Crazy Android");
        books.forEach(ele->System.out.println(ele.length()));

        Map<String, List<String>> schoolsInfo = new HashMap<>();

        List<String> schools = new ArrayList<>();
        schools.add("daadf");
        schools.add("fsadfsa");
        schoolsInfo.put("孙武库", schools);

        schoolsInfo.forEach((key, value)->System.out.println(key + "-->" + value));
   }
}