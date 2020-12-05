public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java"); // "Java" is constant variable
        sb.insert(0, "Hello ");// Hello Java
        sb.replace(5, 6, ",");
        sb.delete(5, 6);
        sb.reverse();

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
        sb.setLength(5); // 
        System.out.println(sb);
    }
}
