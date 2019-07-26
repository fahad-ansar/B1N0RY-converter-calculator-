public class BinaryDiv {

    BinarytoDeci btd =  new BinarytoDeci();
    DecitoBinary dtb =  new DecitoBinary();

    public String[] Divide(String a, String b){
        String[] result = new String[2];

        if(b.length() == a.length()){

            int one = btd.convert(a);
            int two = btd.convert(b);

            if(a.charAt(0) == '-' | b.charAt(0) == '-'){
                result[0] = "1-";
                result[1] = "1-";
            }else if(a.charAt(0) == '-' && b.charAt(0) == '-'){
                result[0] = "0-";
                result[1] = "0-";
            }

            result[0] = dtb.convert(one/two);
            result[1] = dtb.convert(one%two);


        }else return null;

        return result;
    }

}
