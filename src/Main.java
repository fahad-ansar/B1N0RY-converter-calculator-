import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);

    ASCIIBinarytoChar b = new ASCIIBinarytoChar();
    ASCIIChartoBinary c = new ASCIIChartoBinary();
    BinaryAdd ad = new BinaryAdd();
    BinarySubt sb = new BinarySubt();

   BinarytoDeci bd = new BinarytoDeci();
   DecitoBinary db = new DecitoBinary();

    public Main() {

        String s = sb.sbtractIt("10000","10100");
        System.out.println(s);


    }


    public static void main(String[] args) {
        Main m = new Main();
    }
}
