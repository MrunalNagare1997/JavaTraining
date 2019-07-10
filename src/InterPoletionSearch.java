public class InterPoletionSearch {

    public InterPoletionSearch() {
    }

    public void search(int key, int [] data)
    {
        int low=0;
        int high= data.length-1;
        boolean found=false;
        while(high>=low && key>=data[low] && key<=data[high])
        {

            if(high==low)
            {
                if(data[low]==key) {
                    found=true;
                    System.out.println("Data found at index: "+low);
                    return;
                }
            }

            int position=low + (((high-low) / (data[high]-data[low]))*(key - data[low]));
            System.out.println("Position: "+position);
            if(data[position]==key)
            {
                found=true;
                System.out.println("Data found at Index: "+position);
                return;
            }
            else if(key<data[position])
            {
                high=position-1;
            }
            else
            {
                low=position+1;
            }

        }
        if(!found)
        {
            System.out.println("Data not found...");
            return;
        }
    }
}