import java.util.Arrays;

public class leet75 {
    public void sortColors(int[] nums) {


        int low =0;
        int mid=0;
        int high=nums.length-1;

        while(mid<high)
        {

            if(nums[mid]==0)
            {
                //swap(nums,nums[low],nums[mid]);
                int temp;
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;

                low++;
                mid++;

            }
            else if(mid==1)
            {
                mid++;
            }
            else
            {
                //swap(nums,nums[mid],nums[high]);
                int temp;
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;

            }

        }

        Arrays.stream(nums).forEach(System.out::print);

    }


    public static void main(String[] args) {
        int [] arr=new int[]{1,2};

        leet75 leet=new leet75();
        leet.sortColors(arr);



    }
}
