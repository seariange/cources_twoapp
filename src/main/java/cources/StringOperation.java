package cources;

public class StringOperation {
    String str = "hello world";

    char ch = str.charAt(0);//поулчить символ в указаной позиции
    boolean b1 = str.contains("lo"); //есть ли такая последовательность
    boolean b2 = str.endsWith("ld"); //заканчивается ли на такую строку
    boolean b3 = str.startsWith("He");//начинается ли на такую строку
    boolean b4 = str.equals("hello");//равно ли такой строке
    int indx = str.indexOf('w'); //первое вхождение такой буквы/строки
    boolean b5 = str.isEmpty();//пустая ли строка
    int len = str.length();//сколько букв в строке
    String str2 = str.replace('o', 'a');//заменить одну букву на другую
    String str3=str.substring(1,5); //получить подстроку от одного индекса до другого
}
