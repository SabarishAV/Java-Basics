public class StringMethods {
    public static void main(String[] args) {
        String b = "     abcd  ";
        System.out.println("\n" + b);
        System.out.println(b.trim()); // removes spaces before and after the string

        String a = "Hello";
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.substring(3));
        System.out.println(a.substring(1,3));
        System.out.println(a.replace('e','a'));
        System.out.println(a.replace("ello","ii"));
        System.out.println(a.startsWith("He"));
        System.out.println(a.endsWith("lo"));
        System.out.println(a.charAt(1));
        System.out.println(a.indexOf("lo"));
        System.out.println(a.indexOf("l",3));// will only search for after the specified index
        System.out.println(a.lastIndexOf("l")); // the second parameter is to search for after that index
        System.out.println(a.equals("Hello"));
        System.out.println(a.equalsIgnoreCase("hello"));


    }
}
