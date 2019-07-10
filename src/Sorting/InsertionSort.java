package Sorting;

public class InsertionSort {

    public InsertionSort() {
    }

    public int[] sort(int [] dataSet)
    {

        for(int i=0;i<dataSet.length;i++)
        {
            if(i==0)
                continue;;
            int j=i;
            while(dataSet[j-1]>dataSet[j])
            {
                int temp =dataSet[j];
                dataSet[j]=dataSet[j-1];
                dataSet[j-1]=temp;
                j--;
            }

        }
        return dataSet;

    }
}
