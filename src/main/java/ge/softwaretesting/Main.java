package ge.softwaretesting;

public class Main
{
    public static void main(String[] args)
    {
        int [] arr = {18,-3,5,-7,6,89,13,0,-89};

        int temp = 0;
        for (int i = 0; i <arr.length - 1; i++) {
            for (int j = 0; j <arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("{");
        for (int i = 0; i <arr.length; i++){
            if (i==arr.length -1)
                System.out.println(arr[i]+"}");
            else {
                System.out.print(arr[i]+",");
            }
        }

    }
}