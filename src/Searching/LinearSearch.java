package Searching;

import javax.sound.sampled.Line;

public class LinearSearch {

    LinearSearch()
    {

    }

    public void search(int key,int [] dataSet)
    {
        boolean flag = false;

        for(int i=0;i<dataSet.length;i++)
        {
               if(dataSet[i]==key)
               {
                   System.out.println("Data found at index: "+i);
                   flag=true;
                   return;
               }
        }
        if(!flag)
        {
            System.out.println("Data not found...");
            return;
        }
    }



}
