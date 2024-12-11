import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

         int [] arr=new int[6];
         arr[0]=1;
         arr[1]=2;
         arr[2]=3;
         arr[3]=4;
         arr[4]=5;

         int [] arra =new int[]{1,2,2,4,5,6,54,34};

         //Below code is for merge two unsoreted array and distinct word only
      //  IntStream.concat(Arrays.stream(arr), Arrays.stream(arra)).sorted().distinct().forEach(System.out::println);

       // Arrays.stream(arr).sorted().




        ArrayList<String> str=new ArrayList<>();
        str.add("Radha1 Radha2 Radha3");
        str.add("Krishna1 Krishna2 krishna3");

        ArrayList<String> st= new ArrayList<>();
        st.add("Radha");
        st.add("Kishori");
        st.add("Ladli Sarkar");

        ArrayList<String> st1=new ArrayList<>();
        st1.add("Radha");
        st1.add("Kishori");
        st1.add("Albeli Sarkar");
        st1.add("Radhika Kishori");

        //st.stream().filter(st1::contains).forEach(System.out::println);

        //str.stream().map(word->new StringBuffer(word).reverse()).forEach(System.out::println);

        ArrayList<String> str1=new ArrayList<>();
        str1.add("1Radha");
        str1.add("2Shyama");
        str1.add("Kishori");
        str1.add("Brijraj");


        /*str1.stream().filter(s->s.startsWith("1")).forEach(System.out::println);
        str1.stream().filter(s->Character.isDigit(s.charAt(0))).forEach(System.out::println);

        System.out.println(str);*/

       // str.stream().map(s->new StringBuffer(s).reverse()).forEach(System.out::println);


        //str.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

       String s = "A man, a plan, a canal: Panama";
       s= s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        StringBuffer str3=new StringBuffer(s);
        String str4 =str3.reverse().toString();
        System.out.println(str4);

        if(s.equals(str4))
        {
            System.out.println("Equal");
        }







    }




}