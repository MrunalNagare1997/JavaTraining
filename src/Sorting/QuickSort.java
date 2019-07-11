package Sorting;

import java.util.Random;

public class QuickSort {


    public QuickSort() {
    }

    public int partition(int [] array, int low, int high)
    {
        //Generate the random index to be selected as pivot...
        Random rand= new Random();
        int randomIndex= rand.nextInt(high-low)+low;

        //Make the random selected index as the last index of the array...
        int temp1= array[high];
        array[high]=array[randomIndex];
        array[randomIndex]= temp1;

        //initializing the pivot and the index of the smaller element...
        int smallerIndex= low;
        int pivot = array[high];

        //System.out.println("Pivot- "+pivot);

        for(int j=low;j<high;j++)
        {
            if(array[j]<=pivot)
            {

                //If current element is smaller then or equal to the pivot,
                //then increase the smaller index and swap the smaller index element and the current element.
                int temp= array[smallerIndex];
                array[smallerIndex]=array[j];
                array[j]=temp;

                smallerIndex++;

            }
           /* System.out.println("\nSI- "+smallerIndex);
            System.out.print(j+") ");

            for(int i=low;i<=high;i++)
            {
                System.out.print(array[i]+", ");
            }*/
        }


        //Finally swap the current element and the last element.
        int temp= array[smallerIndex];
        array[smallerIndex]=array[high];
        array[high]= temp;

        /*for(int i=low;i<=high;i++)
        {
            System.out.print(array[i]+", ");
        }*/

        return (smallerIndex);
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
