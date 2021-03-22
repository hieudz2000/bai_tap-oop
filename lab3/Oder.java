package lab3;

public class Oder {
    public static final int MAX_NUMBER_ODERED   = 10;
    private DigitalVideoDisc itemsOdered[] = new DigitalVideoDisc[MAX_NUMBER_ODERED];
    private int qtyOdered;
    public Oder(){
     this.qtyOdered = 0;
    }
    public int getQtyOrdered() {
        return qtyOdered;
    }

    public DigitalVideoDisc[] getDigitalVideoDiscs() {
        return itemsOdered;
    }

    public void setDigitalVideoDiscs(DigitalVideoDisc[] digitalVideoDiscs) {
        this.itemsOdered = digitalVideoDiscs;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dic) {
        itemsOdered[qtyOdered++] = dic;
    }

    public void removeDigitalVideoDIsc(DigitalVideoDisc disc) {
        for (int i = 0; i < this.qtyOdered; i++) {
            if (this.itemsOdered[i].getTitle().compareToIgnoreCase(disc.getTitle()) == 0)
                System.arraycopy(this.itemsOdered, i+1, this.itemsOdered, i , this.qtyOdered-- - i);
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < this.qtyOdered; i++)
            total += itemsOdered[i].getCost();
        return total;
    }
}

