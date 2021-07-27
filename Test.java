package string;

public class Test {
    public static void main(String[] args) {
            String str5=new String
        StringBuilder strb=new StringBuilder();

        StringBuffer str=new StringBuffer();
        str=str.append("this");

    //      str=str.append(str+"tree");
    //    str=str.append("kk");
       str.reverse();
       str.append(true);
       str.append(new char[]{'t','o','e'});
       str.append('c');
       str.append(3123);
       str.delete(0,4);
       char []ch=new char[10];
       str.getChars(0, 4, ch, 0);
       for(int i=0;i<5;i++){
           System.out.println(ch[i]);
       }
       
    //    str.substring(4);
    //    System.out.println(str);
         //   str=str.append(str);
        //  str=str.append(str);

        //  str=str.append(str);
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println();
        String ans=str.substring(4);
        String ans2=str.substring(4,8);
        char x[]={'a','b','c'};
        String s=new String(x);
        System.out.println("--------------------------"+s);
        System.out.println(ans2);
        System.out.println(ans.toString());
        System.out.println(str.length());
        // String str1=new String("zeaa");
        // String str2="zaaa";
        // System.out.println(str2.compareTo(str1));
        // System.out.println(str1.hashCode());
        // System.out.println(str2.hashCode());
        // System.out.println(str1==str2);
        // System.out.println(str1.equals(str2));

         //String num="12143242";
        // System.out.println(num.reverse());
        
        // int n=Integer.parseInt(num);
        // System.out.println(n);


    //     String s="  this is a string";
    //     System.out.println(s.charAt(0));
    //     System.out.println(s.trim());
    //     System.out.println(s.toUpperCase());
    //     System.out.println(s.toLowerCase());
    //     String strarr[]=s.split(" ");
    //     for(String str: strarr){
    //         System.out.print(str+"||");
    //     }
    //    String stri="left";
    //    char r[]=stri.toCharArray();
    //    for(int i=0;i<r.length;i++){
    //        System.out.println(r[i]);
    //    }
     
      // System.out.println( s.contains("thisr"));
       
        // String s="abc";
        // String p="abc";
        // String q="abc";

        // String s="abc";
        // String r=s;
        // s=s+"def";
        // System.out.println(r+"  "+s);
        // String str=new String("fan");
        // String str1="tree";//literal
        // String str2="tree"; 
        // String str3=new String("tree");
        // System.out.println(str1==str2);
        // System.out.println(str1==str3);


    }
}
