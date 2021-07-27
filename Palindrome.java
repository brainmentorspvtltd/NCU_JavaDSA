package string;


public class Palindrome {
    static boolean ispalin(String s){
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abcba";
        String str2="abca";
        System.out.println(ispalin(str));
        System.out.println(ispalin(str2));
        //str.intern();

        String str3="This is what is This";
        
    }
}
