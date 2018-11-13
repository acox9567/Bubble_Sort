//Alexander Cox
//Tuesday, November 13, 2018

public class Runner {
    public void main(String[] args)
    {
        int[] arr = {0,5,3,7,34,6,7};
        bubbleSort(arr);
        System.out.println(arr);
    }
    public void bubbleSort(int[] arr)
    {
        int sorted = arr.length;
        int index = 0;

        while (sorted != 0)
        {
            if (arr[index + 1] < arr[index])
            {
                int pHolder = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = pHolder;
                sorted = arr[index + 1];
            }

            if (index != sorted)
                index++;
            else
                index = 0;
        }
    }
}
