package hust.soict.hedspi.aims.order;


import hust.soict.hedspi.aims.disc.DigitalVideoDics;
import hust.soict.hedspi.aims.utils.MyDate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Order {
    MyDate myDate = new MyDate();
    public static final int MAX_NUMBERS_ORDER = 10;
    private int qtyOrdered;
    private static final int MAX_LIMITED_ORDERS = 5;
    private static int check = 0;
    private int check_order = 0;
    private static int nbOrders = 0;
    private static int count_order_limited = MAX_LIMITED_ORDERS;
    private Date dateOrdered;

    private DigitalVideoDics itemsOrdered[] = new DigitalVideoDics[MAX_NUMBERS_ORDER];
    // order : hoa don
    // digitalVideoDict : thong tin cua 1 dia
    // itemsOrder : 1 mang chua thong tin cua nhieu dia
    // qtyOrdered : so luong dia trong 1 hoa don


    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }


    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    SimpleDateFormat formatter = new SimpleDateFormat("  HH:mm:ss dd/MM/yyyy");

//    public void addDigitalVideoDisc(DigitalVideoDics disc) {
//
//        int num_digital = this.getQtyOrdered();
//        if (num_digital > MAX_NUMBERS_ORDER) {
//            System.out.println("Digital Video Disc add fail ! The allowed amount is over !");
//        } else if (num_digital == MAX_NUMBERS_ORDER) {
//            System.out.println("Order is full !");
//        } else {
//            itemsOrdered[num_digital] = disc;
//            this.setQtyOrdered(num_digital + 1);
//            System.out.println("ADD SUCCESSFULLY dvd title : " + itemsOrdered[num_digital].getTitle());
//        }
//
//    }
//
//    public int addDigitalVideoDisc(DigitalVideoDics dvd1, DigitalVideoDics dvd2) {
//        int num_dvd = this.getQtyOrdered();
//        if (num_dvd >= MAX_NUMBERS_ORDER) {
//            System.out.println("Order is full. The list can't add : ");
//            this.printDigitalVideoDisc(dvd1);
//            this.printDigitalVideoDisc(dvd2);
//            return 0;
//        } else {
//            if ((num_dvd + 2) <= MAX_NUMBERS_ORDER) {
//                this.addDigitalVideoDisc(dvd1);
//                this.addDigitalVideoDisc(dvd2);
//            }
//            if ((num_dvd + 1) == MAX_NUMBERS_ORDER) {
//                this.addDigitalVideoDisc(dvd1);
//                System.out.println("DVD can not add : ");
//                this.printDigitalVideoDisc(dvd2);
//
//            }
//        }
//
//        this.setDateOrdered(new Date());
//        return 0;
//    }


//    public void addDigitalVideoDisc(DigitalVideoDics[] dvdList) {
//        int mark = 0;
//        if (this.getQtyOrdered() < MAX_NUMBERS_ORDER) {
//            for (int i = 0; i < dvdList.length; i++) {
//                mark = i;
//                itemsOrdered[this.getQtyOrdered()] = dvdList[i];
//                this.setQtyOrdered(this.getQtyOrdered() + 1);
//                if (this.getQtyOrdered() == MAX_NUMBERS_ORDER) {
//                    System.out.println("Order is full!");
//                    if (mark + 1 < dvdList.length) {
//                        for (int j = mark + 1; j < dvdList.length; j++) {
//                            System.out.println(dvdList[j].getTitle());
//                        }
//                    }
//                    break;
//                }
//            }
//        } else {
//            System.out.println("Order is full ! DVD can not add : ");
//            for (int i = 0; i < dvdList.length; i++) {
//                System.out.println(dvdList[i].getTitle());
//            }
//        }
//        this.setDateOrdered(new Date());
//
//    }

    public void addDigitalVideoDisc(DigitalVideoDics... dics) {
        int num_dvd = dics.length;
        int mark = 0;
        if (this.getQtyOrdered() < MAX_NUMBERS_ORDER && nbOrders < MAX_LIMITED_ORDERS) {
            if (this.getQtyOrdered() == 0) {
                ++nbOrders;
                System.out.println("Order " + nbOrders + " : ");
                check_order = 2;

            }
            for (int i = 0; i < num_dvd; i++) {
                mark = i;
                itemsOrdered[this.getQtyOrdered()] = dics[i];
                this.setQtyOrdered(this.getQtyOrdered() + 1);
                if (this.getQtyOrdered() >= MAX_NUMBERS_ORDER) {
                    if ((mark + 1) < num_dvd) {
                        System.out.println("Order is full ! Can not add them !");
                        System.out.println("DVD can't add : ");
                        for (int j = mark + 1; j < num_dvd; j++) {
                            printDigitalVideoDisc(dics[i]);
                        }
                        break;
                    }

                }

            }
            this.setDateOrdered(new Date());
        }
        if (this.getQtyOrdered() >= MAX_NUMBERS_ORDER && nbOrders <= MAX_LIMITED_ORDERS) {
            System.out.println("Order is full ! Can not add !");
            System.out.println("order that bai !");
        }
        if (nbOrders == MAX_LIMITED_ORDERS && check_order == 0) {
            count_order_limited = count_order_limited + 1;
            System.out.println("Order is limited ! Can not create order " + count_order_limited + " !");
            check = 1;
        }


    }


    public int removeDigitalVideoDisc(DigitalVideoDics dics) {
        for (int i = 0; i < this.getQtyOrdered(); i++) {
            int mark = 0;
            if (dics.equals(itemsOrdered[i])) {
                System.out.println(" Digital Video Dics removed successfully!");
                mark = 1;
            }
            if (mark == 1) {
                for (int j = i; j < this.getQtyOrdered() - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                this.setQtyOrdered(this.getQtyOrdered() - 1);
                --i;
            }
        }
        return 0;

    }


    public float totalCost() {
        float total = 0;
        for (int i = 0; i < this.getQtyOrdered(); i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }


    public void printDigitalVideoDisc(DigitalVideoDics dics) {
        System.out.println(" - " + dics.getTitle() + " - " + dics.getCategory()
                + " - " + dics.getDirector() + " - " + dics.getLength() + " : " + dics.getCost());


    }


    public void printOrder() {
        if (check == 0) {
            System.out.println("**************************************Order**************************************");
            System.out.println("Date : " + formatter.format(this.getDateOrdered()));
            System.out.println("Ordered Items : ");
            for (int i = 0; i < this.getQtyOrdered(); i++) {
                System.out.println("DVD - " + this.itemsOrdered[i].getTitle() + " - " + this.itemsOrdered[i].getCategory()
                        + " - " + this.itemsOrdered[i].getDirector() + " - " + this.itemsOrdered[i].getLength() + " : " + this.itemsOrdered[i].getCost());
            }
            System.out.println("Total cost : " + this.totalCost());
            System.out.println("*********************************************************************************");

        }
    }

    public float getAluckyItem() {
        Random random = new Random();
        int x = random.nextInt(this.getQtyOrdered());

        DigitalVideoDics luckyOrder = this.itemsOrdered[x];
        System.out.println("Lucky Order (free DVD random) "  + luckyOrder.getCategory() + "discount : " + luckyOrder.getCost() );
        float totalCost = this.totalCost() - luckyOrder.getCost();
        return totalCost;

    }


}
