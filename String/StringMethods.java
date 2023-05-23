public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Java assignment by Siddu");
        System.out.println(s1);
        System.out.println("***********************");
        System.out.println(s1.toUpperCase());
        System.out.println("***********************");
        System.out.println(s1.toLowerCase());
        System.out.println("***********************");
        System.out.println(s1.contains("Siddu"));
        System.out.println("***********************");
        System.out.println(s1.contains("Python"));
        System.out.println("***********************");
        System.out.println(s1.indexOf('S'));
        System.out.println("***********************");
        System.out.println(s1.charAt(2));
        System.out.println("***********************");
        System.out.println(s1.substring(5));
        System.out.println("***********************");
        System.out.println(s1.substring(5, 15));
    }
}