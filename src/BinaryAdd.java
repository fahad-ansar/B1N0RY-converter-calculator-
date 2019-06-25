
//Done 100%
public class BinaryAdd {

    private int carry = 0;

    public String addIt(String ab, String ba){

        StringBuilder sb = new StringBuilder();
        carry=0;
        for (int i = ab.length()-1; i >=0; i--) {
            int a = Integer.parseInt(ab.charAt(i)+"");
            int b = Integer.parseInt(ba.charAt(i)+"");
            int asb = addition(a,b);
            System.out.println(a+" "+ b + " = " + asb + "     Carry:" + carry);
            sb.insert(0,asb);
        }
        if(carry==1)sb.insert(0,carry+"");
        sb.insert(0,0+"");
        return sb.toString();
    }

    private int addition( int a, int b){
        int result = 0;
        if(carry==1 ){
            if(a==1 && b==1){
                result = 1;
                carry = 1;
            }else if(a==1 && b==0 || a==0 && b==1){
                result = 0;
                carry = 1;
            }else if(a==0 && b==0){
                result=1;
                carry=0;
            }
        }else if(carry==0){
            if(a==1 && b==1) {
                result = 0;
                carry = 1;
            }else if(a==0 && b==1 || a==1 && b==0){
                result = 1;
                carry = 0 ;
            }
        }else{
            result =0;
        }
        return result;
    }
}
