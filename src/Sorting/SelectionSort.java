package Sorting;

public class SelectionSort {

    public SelectionSort() {
    }


    public void sort(int [] dataset)
    {
        long startTime=System.nanoTime();
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
        long endTime=System.nanoTime();
        System.out.println("time required: "+(endTime-startTime));



    }
}
