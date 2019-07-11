package Sorting;

public class BubbleSort {

    public BubbleSort() {
    }

    public void sort(int [] dataset)
    {
        boolean swaped=false;


        for(int j=0;j<dataset.length;j++)
        {
            swaped=false;
            for (int i = 0; i < dataset.length - 1; i++)
            {
                if (dataset[i] > dataset[i + 1])
                {
                    int temp = dataset[i];
                    dataset[i] = dataset[i + 1];
                    dataset[i + 1] = temp;

                    swaped=true;
                }
            }
            //System.out.println(swaped);

            //if no swap happens then the list is sorted.
            if(!swaped)
            {
                break;
            }
        }


    }

}
