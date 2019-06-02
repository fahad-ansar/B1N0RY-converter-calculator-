public class BinaryAdd {

    private int carry = 0;

    //doesnt end with with correct sum may be fault in addition or addIT


    public String addIt(String ab, String ba){

        StringBuilder sb = new StringBuilder();

        for (int i = ab.length()-1; i >=0; i--) {
            int a = Integer.parseInt(ab.charAt((ab.length()-1)-i)+"");
            int b = Integer.parseInt(ba.charAt((ab.length()-1)-i)+"");
            int asb = addition(carry,a,b);
            System.out.println(a+" " + b + " " + carry + "  = " + asb);
            sb.insert(0,asb);
        }
//        sb.reverse();
        return sb.toString();
    }

    private int addition(int carry, int a, int b){
        int result = 0;
        if(carry==1 ){
            if(a==1 && b==1){
                result = 1;
                carry = 1;
            }else if(a==1 && b==0 || a==0 && b==1){
                result = 0;
                carry = 1;
            }
        }else if(carry==0){
            if(a==1 && b==1) {
                result = 0;
                carry = 1;
            }else if(a==0 && b==1 || a==1 && b==0){
                result = 1;
                carry = 1 ;
            }
        }else{
            result =0;
        }
        return result;
    }
}
