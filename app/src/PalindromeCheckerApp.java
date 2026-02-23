public class PalindromeCheckerApp {
    public static void main(String[] args) {

    String s="madam";
    for(int i = 0; i < s.length()/2; i++) {
        if(s.charAt(i) != s.charAt(s.length()-1-i)) {
            System.out.println("Is it a palindrome? : false");
            return;
        }
    System.out.println("Is it a palindrome? : true");
    }

    //UC3
    String reversed = "";
    for (int  i=s.length()-1; i>=0; i--){
        reversed = reversed + s.charAt(i);
    }
    if (s.equals(reversed)){
        System.out.println("Is it a palindrome? : true");
    } else {
        System.out.println("Is it a palindrome? : false");
    }
}}
