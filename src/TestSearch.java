public class TestSearch {

    public static void main(String [] args)
    {
        int [] data={1,2,3,4,5,6,7,8,9,10};
        LinearSearch searchLinear=new LinearSearch();
        BinarySearch searchBinary= new BinarySearch();

        searchLinear.search(4,data);

        searchLinear.search(20,data);

        searchBinary.search(7,data);

        searchBinary.search(5,data);
    }

}
