package cources;

public class Start {
    public static void main(String[] args) {
        int i = 1; //int - целые числа
        var c = 1;
        String str = "Это строка";

        int [] arr = new int[3]; //Массив

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;

        //поулчаем исходные числа
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        //Складываем
        int sum = a + b;

        //System.out.println(a + " + " + b + " = " + sum);
        System.out.println(arr[0] + "+" + arr[1]+ "+" + arr[3]);
    }
}
