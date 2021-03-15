import java.util.*;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> ans = gss((str));
        System.out.print(ans);
    }

    public static ArrayList<String> gss(String str) { //lets say str =abc
        
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
    
        // for(int i =0;i<str.length();i++){
            char ch = str.charAt(0); //a
            String s = str.substring(1);//bc
            
            ArrayList<String> rres = gss(s); //recursive call
            
            ArrayList<String> mres = new ArrayList<>();
            for(String a : rres){
                mres.add("" + a);
            }
            for(String a : rres){
                mres.add(ch + a);
            }
            return mres;
        // }
        // return mres;
    }

}