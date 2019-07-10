package Searching;

public class TestSearch {

    public static void main(String [] args)
    {
        int [] data={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        LinearSearch searchLinear=new LinearSearch();
        BinarySearch searchBinary= new BinarySearch();
        InterPoletionSearch searchInterpoletion = new InterPoletionSearch();
        ExponantialSearch searchExponentially = new ExponantialSearch();

        searchLinear.search(4,data);


        searchBinary.search(7,data,0,data.length);

        searchInterpoletion.search(21,data);

        searchExponentially.search(30,data);
    }

}
