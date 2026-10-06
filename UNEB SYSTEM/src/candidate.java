public class candidate {
    static String examyear;
    static double regfee;
    static int regnumber;
    static {
        examyear="2026";
        regnumber=11;
        regfee=250000;
        System.out.println("examyear = " + examyear);
        System.out.println("regfee :UGX" + regfee);
        System.out.println("regnumber = " + regnumber);
    }
    String name;
    String regstatus;
    {
        regstatus="registered";
    }
    public candidate(  String n){
        name=n;
    }
    public void  display(){
        System.out.println("candiadate  details ");
        System.out.println("examyear = " + examyear);
        System.out.println("regfee = " + regfee);
        System.out.println("regnumber = " + regnumber);
        System.out.println("name = " + name);
        System.out.println("regstatus = " + regstatus);
    }
}
