/* Задание 1.1
Пример алгоритма из жизни - тот порядок действий, который мы все с урта делаем, собираясь на работу :
Подъем, умывание, позавтракать (если не завтракаете, выпить кофе, если не пьете кофе, выпить чай,
если нет, перейти к следующему действию), одеться и выйти из дома(если дождь, взять зонт  ... итд)  итп...
Пример структур данных - коробка конфет ассорти - двумерный массив , в котором в качестве одномерного массива(строки)
 лежат конфеты с одинаковой начинкой. В разных строках начинки разные.

 /*Задание 2.2
 Это странное задание, так как любая программа -это и есть алгоритм действий. Даже, если в методе main заложена
 всего одна операция, сама инициализация вывода этого метода проходит по определенному алгоритму: определение папки, импорт классов,
 и тд и тп.
 Структуры данных в программировании также встречаются практически везде - массивы, хеш-таблицы, коллекции, сами прогдаммы
 (типа телефонной книги, список сотрудников итд...)итп...
 */


package com.nastya;

import com.nastya.SomeClass;

import java.util.Arrays;

public class Main {
//Задание 1.3
    public static void main(String[] args) {
    int a=0;
	int[]arr1={0, 1, 2, 3};
	SomeClass someObject1 = new SomeClass ( "SomeObject");
        System.out.println ( a);
        System.out.println( Arrays.toString(arr1));
        System.out.println (someObject1.getName () );
        //Задание 1.4
        long t1=System.nanoTime();
        int b=0;
        int[]arr2={0, 1, 2, 3};
        SomeClass someObject2 = new SomeClass ( "SomeObject");
        System.out.println (a==b);
        System.out.println ( Arrays.equals (arr1, arr2));
        System.out.println (someObject1.equals ( someObject2 ));
        long t2=System.nanoTime();
        System.out.println (t2-t1 );
    }
}
