import java.util.ArrayList;

public class BinaryMul {

    BinarytoDeci btd =  new BinarytoDeci();
    DecitoBinary dtb =  new DecitoBinary();

    public String Multiply(String a, String b){
        String result = "";

        if(a.length() == b.length()){

            int one = btd.convert(a);
            int two = btd.convert(b);

            if(a.charAt(0) == '-' | b.charAt(0) == '-'){
                result = "1-";
            }else if(a.charAt(0) == '-' && b.charAt(0) == '-'){
                result = "0-";
            }
            
            result = result + dtb.convert(one*two);

        }else return null;

        return result;
    }
}
