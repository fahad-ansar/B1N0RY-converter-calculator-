public class ChartoBinary {

    String result = "";
    String temp ="";

    public String convert(String s){

        char[] sC = s.toCharArray();

        for (int i = 0; i <sC.length ; i++) {
            char temps = sC[i];
            System.out.println(sC[i]);
            int ascii = (int) temps;
            temp="";
            modulusConvert(ascii);
            temp=temp+"0";
            StringBuilder sb = new StringBuilder(temp);
            sb.reverse();
            result = result +" " + sb;
        }
        return result;
    }


    private void modulusConvert(int a) {
        if (!(a == 1 | a == 0)) {
            int b = a / 2;
            int c = a % 2;
            temp = temp + c;
            modulusConvert(b);
        }else{
            temp = temp +  Integer.toString(a);
        }
    }
}
