import java.util.Arrays;

public class Leet268 {


    public static void main(String[] args) {
        int nums[]={0,1};
        int num=0;

        Arrays.sort(nums);
       // Arrays.stream(nums).forEach(System.out::print);

        for(int i=0;i<=nums.length-1;i++)
        {

            if(nums[i]!=i)
            {
                num=i;
            }
        }
        System.out.println(num);
    }
}
