import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        for(int i=0;i<n;i++){
            if((i+1)%3==0 && (i+1)%5!=0)
                list.add("Fizz");
            else if((i+1)%5==0 && (i+1)%3!=0)
                list.add("Buzz");
            else if((i+1)%3==0 && (i+1)%5==0)
                list.add("FizzBuzz");
            else
                list.add(String.valueOf((i+1)));
        }
        return list;
    }
    public static void main(String[] args){
        int n=3;
        List<String> list=fizzBuzz(n);

    }
}
