package ViolationDemo;
//liskov substitution
//open close

public class LostAadhaar extends CorrectionUpdates{
    public LostAadhaar(CheckAuthentication checkAuthentication){
        super(checkAuthentication);
    }
    void updateAndApply(){
        System.out.println("update and reapply");
    }

}
