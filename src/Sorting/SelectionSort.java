package Sorting;

public class SelectionSort {

    public SelectionSort() {
    }


    public int[] sort(int [] dataset)
    {

        for(int i=0;i<dataset.length;i++)
        {
            int minindex= i;
            for(int j= i+1;j<dataset.length;j++)
            {
                if(dataset[minindex]>dataset[j])
                {
                    minindex=j;
                }
            }
            int temp= dataset[i];
            dataset[i]=dataset[minindex];
            dataset[minindex]=temp;
        }
        return dataset;

    }
}
