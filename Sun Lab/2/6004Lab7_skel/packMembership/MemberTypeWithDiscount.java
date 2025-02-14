package packMembership;

public enum MemberTypeWithDiscount {
    NONE(0.0, 0.0), SILVER(0.05, 0.05)
    , GOLD(0.1, 0.2), PREMIUM(0.3, 0.45);

    private double productDiscountRate;
    private double serviceDiscountRate;

    MemberTypeWithDiscount(double pro, double ser) {
        productDiscountRate = pro;
        serviceDiscountRate = ser;
    }

    public double getProductDiscount() {
        return productDiscountRate;
    }
    public double getServiceDiscount() {
        return serviceDiscountRate;
    }
}
