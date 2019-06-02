import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);

    BinarytoChar b = new BinarytoChar();
    BinaryAdd ad = new BinaryAdd();
    BinarySubt sb = new BinarySubt();

    public Main() {
//        ChartoBinary c = new ChartoBinary();
//        System.out.println(c.convert("Param"));
//
//
//        String result = "";
//        String toConvert = "101101";
//        if(toConvert.contains(" ")){
//           result = b.convert(toConvert);
//        }else {
//            result = b.toChar(toConvert);
//        }

       String a = ad.addIt("101101","010100");
       int result = 0;
        for (int i = a.length()-1; i >=0 ; i--) {
            int k = Integer.parseInt(a.charAt(i)+"");
//            if(k==0)continue;
            int f = k * (int)Math.pow(2,(a.length()-1)-i);
//            System.out.println((int)Math.pow(2,i));
            result=result+f;
        }
        System.out.println(result);
//

//        System.out.println(sb.sbtractIt("101101","010100"));

//        System.out.println(result);

    }


    public static void main(String[] args) {
        Main m = new Main();
    }
}
