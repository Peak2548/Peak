class Lab4Q2_050292 {
    public static void main(String[] args) {
        int price1 = Integer.parseInt(args[0]);
        int price2 = Integer.parseInt(args[1]);
        int price3 = Integer.parseInt(args[2]);
        int amoutCharge;

        if (price1 <= price2 && price1 <= price3) {
            amoutCharge = price2 + price3;
        } else if (price2 <= price1 && price2 <= price3) {
            amoutCharge = price1 + price3;
        } else {
            amoutCharge = price1 + price2;
        }

        System.out.println("Total Cost = " + amoutCharge);
    }
}
