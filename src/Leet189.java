import java.util.Arrays;

public class Leet189 {

    public int[] reverse(int arr[],int ptr1,int ptr2)
    {

        int size=arr.length;

        while(ptr1<ptr2)
        {
            int temp = arr[ptr1];
            arr[ptr1] = arr[ptr2];
            arr[ptr2] = temp;
        }
        return arr;

    }

    public int[] rotate(int[] nums, int k) {



        reverse(nums,0,k);
        reverse(nums,k+1,nums.length);
        reverse(nums,0,nums.length);
        Arrays.stream(nums).forEach(System.out::print);

        return nums;


    }


    public static void main(String[] args) {


        int [] nums=new int[]{1,2,3,4,5,6,7};
        Leet189 let=new Leet189();
        nums=let.rotate(nums,3);
        Arrays.stream(nums).forEach(System.out::print);



    }
}
