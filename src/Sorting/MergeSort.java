package Sorting;

public class MergeSort {


    public MergeSort() {
    }

    public void merge(int []array, int left, int mid ,int right)
    {

        int leftSize= mid-left+1;
        int rightSize= right-mid;

        int [] leftArray= new int[leftSize];
        int [] rightArray= new int[rightSize];

        for(int i=0;i<leftSize;i++)
        {
            leftArray[i]= array[left+i];
        }

        for(int i=0;i<rightSize;i++)
        {
            rightArray[i]= array[mid+1+i];
        }

        int i=0,j=0,k=left;

        while(i<leftSize && j<rightSize) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;

            }
            k++;
        }

        while(i<leftSize)
        {
            array[k]=leftArray[i];
            i++;
            k++;
        }

        while (j<rightSize)
        {
            array[k]=rightArray[j];
            j++;
            k++;
        }
    }

    public void sort(int [] data, int left,int right)
    {
        if(left<right)
        {
            int mid= (left+right)/2;

            sort(data ,left,mid);

            sort(data, mid+1,right);

            merge(data,left,mid,right);
        }

    }

}
