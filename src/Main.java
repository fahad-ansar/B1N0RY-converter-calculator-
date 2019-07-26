import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);

    //ASCII converters
    ASCIIBinarytoChar b = new ASCIIBinarytoChar();
    ASCIIChartoBinary c = new ASCIIChartoBinary();

    //Binary operations
    BinaryAdd ad = new BinaryAdd();
    BinarySubt sb = new BinarySubt();
    BinaryDiv div = new BinaryDiv();
    BinaryMul mul = new BinaryMul();

    //Decimal converters
    BinarytoDeci bd = new BinarytoDeci();
    DecitoBinary db = new DecitoBinary();

    Scanner sc = new Scanner(System.in);

    public Main() {

        while(true) {

            //displaying options
            displayServices();
            int a = sc.nextInt();
            if(a==9) break;

            //Performing the selected task
            useServices(a);
        }

    }


    //Method to display all the functions code can perform
    private void displayServices() {
        System.out.println(
                "Choose one of the following:\n"+
                        "   1. Binary Addition\n"+
                        "   2. Binary Subtraction\n"+
                        "   3. Binary Division\n"+
                        "   4. Binary Multiplication\n"+
                        "   5. Binary to Decimal Converter\n"+
                        "   6. Decimal to Binary Converter\n"+
                        "   7. ASCII(Binary) to String Converter\n"+
                        "   8. String to ASCII(Binary) Converter\n"+
                        "   9. QUIT\n"+
                        "Enter a number from the list above..\n"
        );
    }

    //Method to call the requested methods of the functions
    private void useServices(int a) {

        if(a==1) bAdd();
        else if (a==2) bSub();
        else if (a==3) bDiv();
        else if (a==4) bMul();
        else if (a==5) bToS();
        else if (a==6) sToB();
        else if (a==7) aToS();
        else if (a==8) sToA();

    }

    /*Binary Calculators*/

        //Binary Addition
        private void bAdd() {
        System.out.println("Please enter first number - in Binary:\n");
        String one = sc.next();
        System.out.println("Please enter second number - in Binary:\n");
        String two = sc.next();

        System.out.println("Sum: " + ad.addIt(one,two));
    }

        //Bianry Subtraction
        private void bSub() {
        System.out.println("Please enter number to subtract - in Binary:\n");
        String one = sc.next();
        System.out.println("Please enter number to subtract from - in Binary:\n");
        String two = sc.next();

        System.out.println("Difference: " + sb.sbtractIt(one,two));
    }

        //Binary Division
        private void bDiv() {

        System.out.println("Please enter divisor - in Binary:\n");
        String one = sc.next();
        System.out.println("Please enter dividend - in Binary:\n");
        String two = sc.next();

        String[] ans = div.Divide(two,one);

        System.out.println("Qoutient: " + ans[0]);
        System.out.println("Remainder: " + ans[1]);

    }

        //Binary Multiplication
        private void bMul() {

        System.out.println("Please enter first number - in Binary:\n");
        String one = sc.next();
        System.out.println("Please enter second number - in Binary:\n");
        String two = sc.next();

        System.out.println("Product: " + mul.Multiply(one,two));
    }

    /*Converters*/

        //Binary to Decimal Converter
        private void bToS() {
        do {
            System.out.println("Please enter Binary to convert:\n");
            String one = sc.next();

            System.out.println("String: " + bd.convert(one));
            System.out.println("------------------------");
            System.out.println("press any key to convert another binary else press 'q'\n");

        } while (!sc.next().equals("q"));
    }

        //Decimal to Binary Converter
        private void sToB() {
        do {
            System.out.println("Please enter Decimal to convert:\n");
            int one = sc.nextInt();

            System.out.println("String: " + db.convert(one));

            System.out.println("press any key to convert another decimal else press 'q'\n");
        } while (!sc.next().equals("q"));
    }

        //ASCII(Binary) to String
        private void aToS() {

        do {
            System.out.println("Please enter ASCII(Binary) to convert:\n");
            String one = sc.next();

            System.out.println("String: " + b.convert(one));

            System.out.println("press any key to convert another ASCII(Binary) else press 'q'\n");

        }while (!sc.next().equals("q"));

    }

        //String to ASCII(Binary)
        private void sToA() {
        do {
            System.out.println("Please enter String to convert:\n");
            String one = sc.next();

            System.out.println("String: " + c.convert(one));

            System.out.println("press any key to convert another String else press 'q'\n");

        }while (!sc.next().equals("q"));

    }


    public static void main(String[] args) {
        Main m = new Main();
    }
}
