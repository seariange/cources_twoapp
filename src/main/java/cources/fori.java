package cources;

public class fori {
    public static void main(String[] args) {
        int arr[] = new int [3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;

        for (int i = 0; i < 3; i++) {

            //System.out.println(arr[i]);

        }

        for (int i = 0; i < 10; i++) {
           // System.out.print(i+ " ");
        }

        for (int i = 9; i >= 1; i--) {
            //System.out.print(i+ " ");
        }

        //Первый урок
        /*int x = 3;
        int max = 3000;

        for (int i = 1; i <= max; i++) {
            //System.out.println(x + "*" + i + "=" + x*i);
        }

        for (int i = 1; i < max; i*=x) {
            System.out.println(i);
        }*/

        int max = 70;
        int i;

        for (i = 1; i <= max && i<10; i++) {
           // System.out.println(i);
        }

        //Если число четное, то выводим на экран
        for ( ; i <= max; i+=10) {
            //System.out.println(i);
        }
        //forAndFor(5,5);
        //square(5);
        //line(3);
        triangle(5);

    }

    //Цикл в цикле
    public static  void forAndFor(int first, int second){
        for (int i = 2; i <= first; i++) {
            for (int j = 2; j <= second ; j++) {
                System.out.print(j + "*"+i +"="+i*j+"\t");
            }
            System.out.println("");
        }
    }


    //Вывести линию
    public static void line(int len){
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }

    }

    //Вывести квадрат
    public static void square(int len){
        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //Вывести треугольник
    public static void triangle(int len){
        for (int i = 0; i < len ; i++) {
            for (int j = len; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
