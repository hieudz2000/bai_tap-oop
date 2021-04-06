package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choose;
        Order order = null;
        do {
            System.out.println("Order Management Application: ");
            System.out.println("--------------------------------");
            System.out.println("1. Create new order");
            System.out.println("2. Add item to the order");
            System.out.println("3. Delete item by id");
            System.out.println("4. Display the items list of order");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            choose = sc.nextInt();

            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    if (Order.available()) {
                        order = new Order();
                    } else {
                        System.out.println("Full order!");
                    }
                    break;
                case 2:
                    int idMedia;
                    do {
                        System.out.println("Input id of media : ");
                        idMedia = sc.nextInt();
                        if(0 >= idMedia || idMedia > Media.getListMedia().size()){
                            System.out.println("Media doesn't exist to add!");
                        }
                    } while (0 >= idMedia || idMedia > Media.getListMedia().size());
                    order.addMedia(Media.getMedia(idMedia));

                    break;
                case 3:
                    int idRemove;
                    do {
                        System.out.println("Input id of media : ");
                        idRemove = sc.nextInt();
                        if(0 >= idRemove || idRemove > Media.getListMedia().size()){
                            System.out.println("Media doesn't exist to delete!");
                        }
                    } while (0 >= idRemove || idRemove > Media.getListMedia().size());
                    Media media1 = null;
                    order.removeMedia(media1.getMedia(idRemove));
                    break;

                case 4:
                    order.showListOrder();
                    break;

            }


        } while (choose != 0);


    }

    public static void main(String[] args) {
            ArrayList <String> test = new ArrayList<String>(
                    Arrays.asList("Geeks",
                            "for",
                            "Geeks"));
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Minh thu1", "abv", "xyz", 39, 40);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Minh thu2", "abv", "xyz", 39, 40);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Minh thu3", "abv", "xyz", 39, 40);
//
//        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Minh thu4", "abv", "xyz", 39, 40);
//
//        showMenu();
    }
}
