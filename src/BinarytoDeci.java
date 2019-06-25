//Done 100%

public class BinarytoDeci {


    public int convert(String s){
        int result = 0;
        for (int i = s.length()-1 ; i >= 0 ; i--) {
            int a = Integer.parseInt(s.charAt(i)+"");
            if(a==1){
                int temp = (int) Math.pow(2, ((s.length()-1) -i));
                result = result + temp;
            }
        }
        return result;
    }

}
