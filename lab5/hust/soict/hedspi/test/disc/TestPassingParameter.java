package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDics;

public class TestPassingParameter {
    public void swap(DigitalVideoDics dvd1, DigitalVideoDics dvd2) {
        String title = dvd1.getTitle();
        String director = dvd1.getDirector();
        String category = dvd1.getCategory();
        float cost = dvd1.getCost();
        int length = dvd1.getLength();
        dvd1.setTitle(dvd2.getTitle());
        dvd1.setCategory(dvd2.getCategory());
        dvd1.setDirector(dvd2.getDirector());
        dvd1.setCost(dvd2.getCost());
        dvd1.setLength(dvd2.getLength());
        dvd2.setTitle(title);
        dvd2.setDirector(director);
        dvd2.setCategory(category);
        dvd2.setCost(cost);
        dvd2.setLength(length);
    }



    public static void main(String[] args) {
        DigitalVideoDics dvd1 = new DigitalVideoDics("abc","xyz", "123",4,5);
        DigitalVideoDics dvd2 = new DigitalVideoDics("abc1","xyz", "123",4,5);
        TestPassingParameter test = new TestPassingParameter();
        System.out.println(dvd1.getTitle());
        test.swap(dvd1,dvd2);
        System.out.println(dvd1.getTitle() + dvd2.getTitle());
    }


}
