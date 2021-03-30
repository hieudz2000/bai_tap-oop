package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDics;
import hust.soict.hedspi.aims.order.Order;

public class Main {

    public static void main(String[] args) {
        DigitalVideoDics dvd1 = new DigitalVideoDics("The Lion King", "Animation", "Ronger Aller",
                198, 19.5f);
        DigitalVideoDics dvd2 = new DigitalVideoDics("Star wars", "Sicence fiction",
                "George Lucas", 200, 19.9f);
        DigitalVideoDics dvd3 = new DigitalVideoDics("Aladdin3", "Animation", "John Master",
                100, 17.59f);
        DigitalVideoDics dvd4 = new DigitalVideoDics("Aladdin4", "Animation1", "John Master1",
                100, 17.13f);

        Order order = new Order();
        order.addDigitalVideoDisc(dvd1);
        order.printOrder();

        Order order1 = new Order();
        order1.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2, dvd3);
        order1.addDigitalVideoDisc(dvd1);
        order1.printOrder();

        Order order2 = new Order();
        order2.addDigitalVideoDisc(dvd1, dvd1, dvd3, dvd4, dvd1, dvd4, dvd2, dvd3, dvd1);
        order2.printOrder();

        Order order3 = new Order();
        order3.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2, dvd3, dvd1, dvd1, dvd1, dvd4, dvd4);
        order3.addDigitalVideoDisc(dvd2);
        order3.printOrder();

        Order order4 = new Order();
        order4.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2);
        order4.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2);
        order4.printOrder();

        Order order5 = new Order();
        order5.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2, dvd3, dvd1, dvd1, dvd1);
        order5.printOrder();

        Order order6 = new Order();
        order6.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd1, dvd4, dvd2);
        order6.printOrder();
        dvd1.search("lskdjf");
    }
}
