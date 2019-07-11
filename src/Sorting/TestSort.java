package Sorting;

public class TestSort {

    public static void printArray(int [] data)
    {
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int []data= {1,2,3,1,2,7,3,4,5,8,2,3,5};
        //int []data= {1,2,3,4,5,6,7,8,9,10};

        SelectionSort sortSelecting = new SelectionSort();
        BubbleSort sortBubble = new BubbleSort();
        InsertionSort sortInsertion =new InsertionSort();
        MergeSort sortMere = new MergeSort();
        QuickSort sortQuick = new QuickSort();
        HeapSort sortHeap = new HeapSort();

        System.out.println("\nBubble Sort...");
        sortBubble.sort(data);
        printArray(data);

        System.out.println("\nSelection Sort...");
        sortSelecting.sort(data);
        printArray(data);

        System.out.println("\nInsertion Sort...");
        sortInsertion.sort(data);
        printArray(data);

        System.out.println("\nMerge Sort...");
        sortMere.sort(data,0, data.length-1);
        printArray(data);

        System.out.println("\nQuick Sort...");
        sortQuick.sort(data,0,data.length-1);
        printArray(data);

        System.out.println("\nHeap Sort...");
        sortHeap.sort(data);
        printArray(data);

    }


}
