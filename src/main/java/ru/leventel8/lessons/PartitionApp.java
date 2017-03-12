package ru.leventel8.lessons;

class PartitionApp {

    public static void main(String[] args){

        int maxSize = 16;                                   // максимальный размер массива
        ArrayPar arr;
        arr = new ArrayPar(maxSize);                        // создание нового массива размера maxSize

        for(int j=0; j<maxSize; j++){                       // вставка рандомных элемнтов в массив

            long n = (int)(java.lang.Math.random()*199);
            arr.insert(n);


        }
        arr.display();                                      // вывод элементов массива

        long pivot = 99;                                    // опорное значение
        System.out.print("опорное значение "+ pivot);
        int size = arr.size();
        int partDex = arr.partitionIt(0, size-1, pivot);

        System.out.println(", разбиение с ячейки " + partDex);
        arr.display();                                     // вывод неполностью отсортированного массива


    }

}
