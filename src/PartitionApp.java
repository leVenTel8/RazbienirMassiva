class PartitionApp {

    public static void main(String[] args){

        int maxSize = 16;
        ArrayPar arr;
        arr = new ArrayPar(maxSize);

        for(int j=0; j<maxSize; j++){

            long n = (int)(java.lang.Math.random()*199);
            arr.insert(n);


        }
        arr.display();

        long pivot = 99;
        System.out.print("опорное значение "+ pivot);
        int size = arr.size();
        int partDex = arr.partitionIt(0, size-1, pivot);

        System.out.println(", разбиение с ячейки " + partDex);
        arr.display();

    }

}
