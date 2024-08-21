public class InternExample {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = "hello";
        
        // Compare references before interning
        System.out.println("Before interning:");
        System.out.println("str1 == str2: " + (str1 == str2));  // false

        // Intern str1 and compare references again
        str1 = str1.intern();
        
        System.out.println("After interning:");
        System.out.println("str1 == str2: " + (str1 == str2));  // true
    }
}