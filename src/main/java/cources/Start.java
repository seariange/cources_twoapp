package cources;

public class Start {
    public static void main(String[] args) {
       // int i = 1; //int - целые числа
        //var c = 1;
        //String str = "Это строка";

        //int [] arr = new int[3]; //Массив
        //arr[0] = 11;
        //arr[1] = 22;
        //arr[2] = 33;

        //поулчаем исходные числа
        //double a = Double.parseDouble(args[0]);
        //double b = Double.parseDouble(args[1]);
        //Складываем
        //double sum = a + b;

        //System.out.println(sum);

        //System.out.println(a + " + " + b + " = " + sum);
        //System.out.println(arr[0] + "+" + arr[1]+ "+" + arr[3]);


        //Особенности значений
        int x = 2_000_000_000;
        int y = 2_000_000_000;
        int nol = 0;

        int sum = x + y;
        //int nol1 = x/nol;
        System.out.println(sum); //получили -294967296, потому что зашли за границы int (не попали в диапозон)

        //System.out.println(nol1); //ошибка - делить на 0 нельзя!

        /*
        //у дабла есть шанс потерять данные
        double d = 1;
        System.out.println("1/98 и получаем: ");
        d = d/98;
        System.out.println(d);
        System.out.println("Полученное число " + d + " умножаем на 98");
        d = d*98; //потеря данных
        System.out.println(d);
        */

        //приведение типов
        int v =3;
        double d = x; //приведение типов, в дабле приводится тип int

        x = (int)d; //принудительно сделали из дабл в инт!

        String str2 = "qwerty";
        System.out.println(str2);

    }
}
