public class BinarySubt {

    BinaryAdd ad = new BinaryAdd();

    public String sbtractIt(String a, String b){
        String aC = twoCompl(a);
        ad.addIt(aC,b);
        return "";
    }

    private String twoCompl(String a) {
        return ad.addIt(a,"00001");
    }

}
