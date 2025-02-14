package packMembership;

public class Client implements CanPay {
    private String name;
    private MemberTypeWithDiscount memberType;
    public Client(String n) {
        name = n;
        memberType = MemberTypeWithDiscount.NONE;
    }
    private void promoteMemberType() {
        if (memberType == MemberTypeWithDiscount.NONE)
            memberType = MemberTypeWithDiscount.SILVER;
        else if (memberType == MemberTypeWithDiscount.SILVER)
            memberType = MemberTypeWithDiscount.GOLD;
        else if (memberType == MemberTypeWithDiscount.GOLD)
            memberType = MemberTypeWithDiscount.PREMIUM;
            showMemberStatus();
    }
    private void demoteMemberType() {
        if (memberType == MemberTypeWithDiscount.PREMIUM)
            memberType = MemberTypeWithDiscount.GOLD;
        else if (memberType == MemberTypeWithDiscount.GOLD)
            memberType = MemberTypeWithDiscount.SILVER;
        showMemberStatus();
    }
    public void showMemberStatus() {
        System.out.println(name + " is now " + memberType + " "
        + (int)(memberType.getProductDiscount() * 100) + "% " + "discount on Product  " + 
        (int)(memberType.getServiceDiscount() * 100) + "% " + "discount on Service");
    }
    public void spend(int direction) {
        if (direction > 0) {
            promoteMemberType();
            return;
        } 
        demoteMemberType();
    }

}