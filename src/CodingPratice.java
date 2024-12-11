import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodingPratice {

    public static void main(String[] args) {


        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        List<Double> listd=Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        String newString= listOfStrings.toString();
        //System.out.println(newString);
        String lists=  listd.stream().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining(" "));
        //System.out.println(lists);

        List<String> liststring = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");


        char[] ch={'R','A','D','H','A'};
        String chr= Stream.of(ch).map(arr->new String(arr)).collect(Collectors.joining());
       // System.out.print(chr);

        List<Integer> num=Arrays.asList(5,20,25,30,49,57,55,23);
        //num.stream().filter(i->i%5==0).forEach(System.out::println);


        Integer maxx= num.stream().max(Comparator.naturalOrder()).get();

        System.out.println(maxx);


        Integer min=num.stream().min(Comparator.naturalOrder()).get();

        int [] arr=new int[5];
        int[][]arr1=new int [4][6];
        int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
        int [] arr3={1,2,3,4,5,};
         int [] arr4=new int[]{1,2,3,4,};

        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};
        int [] c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.stream(c));

        










    }


}
