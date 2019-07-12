package Sorting;

public class HeapSort {

    public HeapSort() {
    }
    private void adjustHeap(int [] array, int length, int node)
    {

        int largest= node;
        //Finding the left and right children of the current node...
        int left= node*2+1;
        int right= node*2+2;

        if(left< length && array[largest]<array[left])
        {
            largest=left;
        }

        if(right< length && array[right]> array[largest])
        {
            largest=right;
        }

        if(largest!=node)
        {
            int temp =array[node];
            array[node]=array[largest];
            array[largest]=temp;

            //System.out.println("Current heap...");
            //TestSort.printArray(array);

            adjustHeap(array,length,largest);
        }

    }
    public void sort(int [] dataSet)
    {



        for(int currentNode=dataSet.length/2-1;currentNode>=0;currentNode--)
        {
            //System.out.println(currentNode);

            adjustHeap(dataSet, dataSet.length, currentNode);
        }
        //System.out.println("Sorting...");
        for(int currentNode= dataSet.length-1;currentNode>=0;currentNode--)
        {
            //Remove the root and add it to the last of the array...
            int largest= dataSet[0];
            dataSet[0]=dataSet[currentNode];
            dataSet[currentNode]=largest;

            //Adjust the remaining array...
            adjustHeap(dataSet,currentNode,0);

        }


    }
}
