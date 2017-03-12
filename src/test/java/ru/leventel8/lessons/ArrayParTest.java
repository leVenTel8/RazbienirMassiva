package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayParTest {
    /**
     * проверка вставки
     * в массив
     */
    @Test
    public void testInsert() {
        ArrayPar arrayPar = new ArrayPar(8);        //создание объекта массива с размеров 8 ячеик
        arrayPar.insert(9);                        // вставка в массив
        arrayPar.insert(10);
        assertEquals(9,arrayPar.getFirst());    // сравнение ожидаемого значения, с возвращаемым
    }//end testInsert()

    /**
     * проверка размера
     * массива
     */
    @Test
    public void testSize() {
        ArrayPar arrayPar = new ArrayPar(8);        //создание объекта массива с размеров 8 ячеек
        arrayPar.insert(9);                        // вставка в массив
        arrayPar.insert(10);
        assertEquals(2,arrayPar.size());         // сравнение ожидаемого значения, с возвращаемым

    }//end testSize()

    @Test
    public void testPartitionIt() {
        ArrayPar arr = new ArrayPar(10);            //создание объекта массива с размеров 10 ячеек

        long pivot = 99;                                // задаем опорное значение

        arr.insert(157);                           // вставляем эементыв массив
        arr.insert(650);
        arr.insert(350);
        arr.insert(450);
        arr.insert(90);
        arr.insert(44);
        arr.insert(3);
        arr.insert(100);
        arr.insert(50);
        arr.insert(1000);
        int size = arr.size();                          // определяем размер массива
        assertEquals(4,arr.partitionIt(0, size-1, pivot)); // сравниваем ожидаемое значение с выходным

    }//end testPartitionIt()

}//end class ArrayParTest
