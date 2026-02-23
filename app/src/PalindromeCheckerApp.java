public class PalindromeCheckerApp {
    public static void main(String[] args) {
    System.out.println("Welcome to the Palindrome Checker App!");
    System.out.println("Version : 1.0");
    System.out.println("System initialized successfully.");
    String s="madam";
    for(int i = 0; i < s.length/2; i++) {
        if(s.charAt(i) != s.charAt(s.length-1-i)) {
            System.out.println("Is it a palindrome? : false");
            return;
        }
    System.out.println("Is it a palindrome? : true");
    }

}}
