package lab4;

public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();
        DigitalVideoDisc disc = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95F);
        DigitalVideoDisc disc1 = new DigitalVideoDisc("Star wars", "Science Fiction", "Geore Lucas", 87, 24.95F);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Aladin", "Animation", 24.95F);
        anOrder.addDigitalVideoDisc(disc);
        anOrder.addDigitalVideoDisc(disc1);
        anOrder.addDigitalVideoDisc(disc2);
        anOrder.removeDigitalVideoDIsc(disc2);
        System.out.println("Total Cost is : " + anOrder.totalCost());
        anOrder.removeDigitalVideoDIsc(disc);
        System.out.println("Total Cost is : " + anOrder.totalCost());
    }
}
