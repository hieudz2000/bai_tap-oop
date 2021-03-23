package lab4;

public class Order {
    private static final int MAX_NUMBERS_ITEMSORDERED = 20;
    private static final int MAX_NUMBERS_ORDER = 10;
    private static int itemsOrdered = 0;
    private MyDate dateOrdered;
    private int qtyOrdered;
    private DigitalVideoDisc digitalVideoDiscs[] = null;
    public Order() {
        if (itemsOrdered >= MAX_NUMBERS_ORDER) {
            System.out.println("Khong the tao moi");
        }else{
            this.digitalVideoDiscs = new DigitalVideoDisc[MAX_NUMBERS_ITEMSORDERED];
            Order.itemsOrdered++;
            this.qtyOrdered = 0;
        }
    }
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public DigitalVideoDisc[] getDigitalVideoDiscs() {
        return digitalVideoDiscs;
    }
    public void setDigitalVideoDiscs(DigitalVideoDisc[] digitalVideoDiscs) {
        this.digitalVideoDiscs = digitalVideoDiscs;
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc dic) {
        if(this.digitalVideoDiscs == null) return false;
        if (this.qtyOrdered < MAX_NUMBERS_ITEMSORDERED) {
            digitalVideoDiscs[qtyOrdered++] = dic;
            return true;
        }
        return false;
    }
    public boolean addDigitalVideoDisc(DigitalVideoDisc dvdList[]) {
        if(this.digitalVideoDiscs == null) return false;
        if (dvdList.length > MAX_NUMBERS_ITEMSORDERED - qtyOrdered) {
            System.arraycopy(dvdList, 0, this.digitalVideoDiscs, qtyOrdered, MAX_NUMBERS_ITEMSORDERED - qtyOrdered);
            System.out.println("Danh sach cac DVD khong the dua vao don hang :");
            for (int i = MAX_NUMBERS_ITEMSORDERED - qtyOrdered; i < dvdList.length; i++)
                System.out.println(dvdList[i].getTile());

            qtyOrdered = MAX_NUMBERS_ITEMSORDERED;
            return false;
        }
        System.arraycopy(dvdList, 0, this.digitalVideoDiscs, qtyOrdered, dvdList.length);
        qtyOrdered += dvdList.length;
        return true;
    }
    public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(this.digitalVideoDiscs == null) return false;
        if (qtyOrdered < MAX_NUMBERS_ITEMSORDERED - 2) {
            this.digitalVideoDiscs[qtyOrdered++] = dvd1;
            this.digitalVideoDiscs[qtyOrdered++] = dvd2;
            return true;
        } else if (qtyOrdered < MAX_NUMBERS_ITEMSORDERED - 1) {
            this.digitalVideoDiscs[qtyOrdered++] = dvd1;
            System.out.println("Mat hang khong the them vao don hang : ");
            System.out.println(dvd2.getTile());
        } else {
            System.out.println("Mat hang khong the them vao don hang : ");
            System.out.println(dvd2.getTile());
            System.out.println(dvd1.getTile());
        }
        return false;
    }

    public boolean removeDigitalVideoDIsc(DigitalVideoDisc disc) {
        int tag = 0;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.digitalVideoDiscs[i].getTile().compareToIgnoreCase(disc.getTile()) == 0) {
                System.arraycopy(this.digitalVideoDiscs, i + 1, this.digitalVideoDiscs, i, this.qtyOrdered-- - i);
                ++tag;
            }
        }
        return tag == 0 ? false : true;
    }
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < this.qtyOrdered; i++)
            total += digitalVideoDiscs[i].getCost();
        return total;
    }
    public double getTotalCount(){
        double total =0;
        for (int i = 0; i < this.digitalVideoDiscs.length; i++) {
            total+=this.digitalVideoDiscs[i].getCost();
        }
        return total;
    }
    public void viewOrder(){
        if(this.qtyOrdered == 0 || this.digitalVideoDiscs == null){
            System.out.println("Don hang rong");
        }else{
            System.out.println("******************** Dat hang ********************************");
            System.out.println("Ngay:" + dateOrdered);
            for (int i = 0; i < this.digitalVideoDiscs.length; i++)
                this.digitalVideoDiscs[i].viewDVD(i);
            System.out.println("Tong chi phi : " + getTotalCount());
            System.out.println("**************************************************************");

        }
    }
}
