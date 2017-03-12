package ru.leventel8.lessons;

class ArrayPar {

    private long[] theArray;                        //Переменная приватного типа, объявление массива
    private int nElems;                             //Переменная приватного типа, объявление счетчика элементов массива

    /**
     * Конструктор при инициализации
     * принимает параметр max
     * @param max
     *      размер массива
     */
    public ArrayPar(int max){

        theArray = new long[max];
        nElems = 0;

    }

    /**
     * вставка в массив
     * @param value
     */
    public void insert(long value){

        theArray[nElems] = value;           // вставка value в ячейку nElems
        nElems++;                           // имнкримент nElems

    }//end insert()

    /**
     * определение размера массива
     * @return nElems
     */
    public int size(){

        return nElems;
    }

    /**
     * вывод содеримого массива
     */
    public void display(){

        System.out.print("A=");
        for(int j=0; j<nElems; j++)
            System.out.print(theArray[j]+ " "); //вывод содержимого
        System.out.println("");

    }

    /**
     * неполная сортировка массива, разбиением
     * @return leftPtr
     */
    public int partitionIt(int left, int right, long pivot){

        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while(true){

            while(leftPtr < right && theArray[++leftPtr]<pivot);        // реализация алгоритма
            while(rightPtr > left && theArray[--rightPtr]>pivot);
            if(leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);


        }
        return leftPtr;

    }//end partitionIt()

    /**
     * swap принятых параметров
     * @param  dex1, dex2
     */
    public void swap(int dex1, int dex2){

        long temp;
        temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }//end swap()

    /**
     * метод для JUnit тестов
     * вытаскивает первое значение массива
     * @return first
     */
    public long getFirst(){
        long first;
        first = theArray[0];
        return first;
    }//end getFirst()

}//end class ArrayPar
