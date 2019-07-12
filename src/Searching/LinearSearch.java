package Searching;

import javax.sound.sampled.Line;

public class LinearSearch {

    LinearSearch()
    {

    }

    public void search(int key,int [] dataSet)
    {
        boolean flag = false;
        long startTime=System.nanoTime();
        for(int i=0;i<dataSet.length;i++)
        {
               if(dataSet[i]==key)
               {
                   System.out.println("Data found at index: "+i);
                   flag=true;

               }
        }
        long endTime=System.nanoTime();
        System.out.println("time required: "+(endTime-startTime));
        if(!flag)
        {
            System.out.println("Data not found...");
            return;
        }

    }



}
