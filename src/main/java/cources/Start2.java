package cources;

import static java.lang.Long.sum;

public class Start2 {
    public static void main(String[] args) {
        //int num = sum(2,3);
        //System.out.println(num);
        //sum2(2,6); //вызов void - ничего не возвращаем
        helloName("Alex");
        System.out.println(isLowerCase('Q'));
        System.out.println(toUpperCase('a'));

    }

    public static int sum(int x, int y){
        int res=x+y;
        return res;
    }

    public static void sum2(int x, int y){
        System.out.println(x+y);
    }

    public static void helloName (String name){
        System.out.println("Hello" + name + "!");
    }

    public static boolean isLowerCase (char ch){
        return ch>='a'&&ch<='z';
    }

    public static char toUpperCase (char ch){
        int diff = 'a'-'A'; //разница в кодах маленьких и больших букв
        int res = ch - diff; // уменьшаем код маленькой буквы на разницу
        return (char)res; //возвращаем полученную букву
    }

}
