package string;

public class ProperCase {
    static String convert(String s){
        if(s==null){
            return "";
        }
        //Character.toUpperCase(s.charAt(0));
        // for(int i=1;i<s.length();i++){
        //     //Character.toLowerCase(s.charAt(i));
        // }
        String temp=s.substring(1);
        temp=temp.toLowerCase();
        temp=Character.toUpperCase(s.charAt(0))+temp;
        return temp;

    } 
 public static void main(String[] args) {
     String str="thiS iS A StrinG";
     //"This Is A String"

     String arr[]=str.split(" ");
     str="";
     for(String s:arr){
         String ans=convert(s);
        str=str+ans+" ";
        }

        System.out.println(str);
 }   
}
