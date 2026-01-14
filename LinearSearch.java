public class LinearSearch 
{
    public static void main(String[] args) 
  {
        int[] arr = {4, 7, 2, 9, 1};
        int key = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++)
          {
            if (arr[i] == key)
            {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
