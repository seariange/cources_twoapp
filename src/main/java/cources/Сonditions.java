package cources;


public class Сonditions {
    public static void main(String[] args) {
        //System.out.println(min(-1,0));
       // System.out.println(delLast("aba"));
        System.out.println(test1("qwe"));
    }

    public static boolean checkString(String str){
        String[] words = str.split(" ");
        for(String word: words){
            if(word.length()>3){
                char ch = word.charAt(0);
                if(ch<'A' || ch>'Z') return false;
            }
        }
        return true;
    }

    public static int min(int x, int y){
        if (x>y) return y;
        return x;
    }

    public static boolean isEqualLastAndFirst(String str){
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        return first==last;
    }

    public static String delLast(String str){
        String res;

        if(isEqualLastAndFirst(str)){
            res = str.substring(0, str.length()-1);
        } else {res= str + 'F';}

        return res;
    }

    public static String test1(String str){
        switch(str){
            case "A": str+="B"; break;
            case "B": str+="C"; break;
            case "C": str+="D"; break;
            case "D": str+="E"; break;
            case "E": str+="F"; break;
            default: str+="!";
        }
        return str;
    }

}
