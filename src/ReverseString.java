public class ReverseString {
    public String reverseString(String s) {
        //StringBuilder sb=new StringBuilder(s);
        //return sb.reverse().toString();
        char[] cs=s.toCharArray();
        int i=0,j=cs.length-1;
        while(i<j){
            char temp=cs[j];
            cs[j]=cs[i];
            cs[i]=temp;
            i++;
            j--;
        }

        return String.valueOf(cs);
    }


}
