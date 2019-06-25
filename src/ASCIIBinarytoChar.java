
//Done 100%

public class ASCIIBinarytoChar {


    public String convert(String s){
        String result = "";
        char[] sC = s.toCharArray();
        int i = 0;
        String temp = "";
        while(true){
            if(i == sC.length-1){
                temp = temp + sC[i] + "";
                result = result + toChar(temp);
                temp = "";
                break;
            }
            if(sC[i]==' ') {
                if(!temp.equals(""))result = result + toChar(temp);
                temp = "";

            }else{
                temp = temp + sC[i] + "";
            }
            i++;
        }
        return result;
    }

    public String toChar(String s){
        char[] sC = s.toCharArray();
        int result = 0;
        for (int i = sC.length-1 ; i >= 0 ; i--) {
            int a = Integer.parseInt(sC[i]+"");
            if(a==1){
                int temp = (int) Math.pow(2, ((sC.length-1) -i));
                result = result + temp;
            }
        }

        char l = (char) result;
        return  l +"";
    }
}
