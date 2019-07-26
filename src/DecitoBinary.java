//Done 100%

public class DecitoBinary {

    String hereTemp="";


    public String convert(int a){
        hereTemp  ="";
        modulus(a);
        StringBuilder sb = new StringBuilder(hereTemp);
        sb.reverse();
        return sb.toString();
    }


    private void modulus(int a) {
        if (!(a == 1 | a == 0)) {
            int b = a / 2;
            int c = a % 2;
            hereTemp = hereTemp + c;
            modulus(b);
        }else{
            hereTemp = hereTemp +  Integer.toString(a);
        }
    }
}
