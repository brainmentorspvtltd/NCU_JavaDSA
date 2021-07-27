package string;

public class StringReverse {

    static String reverseIt(String s){
        char ch[]=s.toCharArray();
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String str=" this is a string";
        String arr[]=str.split(" ");
        String ans="";
        for(String s:arr){
            // StringBuilder st=new StringBuilder(s);
            // st.reverse();
            String st=reverseIt(s);
            ans=ans+st+" ";
        }
        System.out.println(ans);
    }
}
