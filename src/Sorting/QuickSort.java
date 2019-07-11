package Sorting;

import java.util.Random;

public class QuickSort {


    public QuickSort() {
    }

    public int partition(int [] array, int low, int high)
    {

        int smallerIndex= low-1;

        int pivot = array[low];
        //System.out.println("Pivot- "+pivot);

        for(int j=low;j<high;j++)
        {
            if(array[j]>=pivot)
            {
                smallerIndex++;

                //If current element is smaller then or equal to the pivot,
                //then increase the smaller index and swap the smaller index element and the current element.
                int temp= array[smallerIndex];
                array[smallerIndex]=array[j];
                array[j]=temp;


            }
           /* System.out.println("\nSI- "+smallerIndex);
            System.out.print(j+") ");

            for(int i=low;i<=high;i++)
            {
                System.out.print(array[i]+", ");
            }*/
        }


        //Finally swap the current element and the last element.
        int temp= array[smallerIndex+1];
        array[smallerIndex+1]=array[high];
        array[high]= temp;

        /*for(int i=low;i<=high;i++)
        {
            System.out.print(array[i]+", ");
        }*/

        return (smallerIndex+1);
    }

    public void sort(int [] dataSet,int low, int high)
    {

        if (low<high)
        {
            //get the partitioning index...
            int pi= partition(dataSet,low,high);

            //call sort for left array...
            sort(dataSet,low,pi-1);

            //call sort for right array...
            sort(dataSet,pi+1,high);

        }

    }
}
