package yeekku;

public class OutputFieldTest {
    public static void main(String[] args) {
        System.out.println(lee.Output.MAX_CACHE_LINE);
        // next sentence will raise "assign erro"
        // lee.Output.MAX_CACHE_LINE = 20;
        System.out.println(lee.Output.staticTest());
    }
    
}
