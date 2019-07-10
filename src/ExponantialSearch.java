

public class ExponantialSearch {

    public ExponantialSearch() {
    }

    public void search(int key,int [] dataSet)
    {
        int index=1;
        BinarySearch searchBinary=new BinarySearch();

        if(key==dataSet[0])
        {
            System.out.println("data found at index: 0");
            return;
        }

        while(index< dataSet.length && dataSet[index]<=key)
        {
            index=index*2;

            //as the index is doubles per iteration it may excel the length of the dataset.
            //so we need to reduce the index if it goes beyond the length.
            if(index>=dataSet.length)
            {
                int diff =index-dataSet.length+1;
                index-= diff;
                break;
            }

        }

        searchBinary.search(key,dataSet,index/2,(index<dataSet.length)? index:dataSet.length);

    }
}
