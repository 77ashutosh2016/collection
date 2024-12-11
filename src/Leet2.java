import java.util.Arrays;
import java.util.LinkedHashSet;

public class Leet2 {

    public static void main(String[] args) {

        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
       /* LinkedHashSet<Integer> set =new LinkedHashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        System.out.println(set.size());
        //set.forEach(System.out::print);
        //System.out.println(" break");

        Integer num[]=new Integer[set.size()];
        num=set.toArray(num);

        //Arrays.stream(num).forEach(System.out::print);

        int [] expectedNums=new int[nums.length];
        expectedNums[0]=nums[0];
        for(int i=1, j=0;i<nums.length;i++)
        {
            if(nums[i]!=expectedNums[j])
            {
                expectedNums[j+1]=nums[i];
                j++;
            }

        }
        Arrays.stream(expectedNums).forEach(System.out::print);*/


        int j=0;
        for(int i=1;i<nums.length&&j<nums.length;i++)
        {

            if(nums[i]!=nums[j])
            {
                nums[j+1]=nums[i];
                j++;

            }


        }


        Arrays.stream(nums).forEach(System.out::print);
        System.out.println(j);

    }
}
