public class BinarySubt {

    DecitoBinary db = new DecitoBinary();
    BinarytoDeci bd = new BinarytoDeci();

    //'a' is greater number and 'b' is number taken out of 'a'

    public String sbtractIt(String b, String a){
        String result = "";
       int f = bd.convert(b);
       int d = bd.convert(a);

       if(b.length()!=a.length()){

           System.out.println("Not of same size");
           System.exit(1);
       }else {
           int flag = 0;
           int siz = a.length();
           int k = d - f;
           if(k<0){
               flag =1;
               k = k*-1;
           }
           String c = db.convert(k);

           if(flag==1)  result = "-";
           if(c.length()<siz){
               int sk = siz-c.length();
               for (int i = 0; i <sk ; i++) {
                    result = result +0 +"";
               }
           }
           result =result +c;
       }
        return result;
    }

}
