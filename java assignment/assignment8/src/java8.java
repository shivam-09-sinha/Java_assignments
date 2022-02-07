class cvv extends Exception{
    public cvv(String str){
        super(str);
    }
};

class ATM extends Exception{
    public ATM(String str){
        super(str);
    }
};

class OTP extends Exception{
    public OTP(String str){
        super(str);
    }
};


class verify extends Exception{

    public void CheckDetails(String cvv,String atm,String otp)throws cvv,ATM,OTP {

        if(atm.length()!=16){
            throw new ATM("ATM number must me of 16-digit");
        }
        if(cvv.length()!=3)
        {
            throw new cvv("CVV is invalid");
        }
        if(otp.length()!=4){
            throw new OTP("Otp is incorrect");
        }
    }
};

public class java8 {

    public static void main(String[] args) {

        try {
            verify obj = new verify();
            obj.CheckDetails("4040","1111111111111111","45650");
        }
        catch(cvv | ATM | OTP e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception not caught.");
        }

    }

}