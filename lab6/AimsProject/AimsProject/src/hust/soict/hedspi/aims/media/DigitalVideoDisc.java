package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.media.Media;

import java.util.Locale;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;


    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(String title) {
        this.setTitle(title);

    }

    public DigitalVideoDisc(String title, String category) {
        this.setTitle(title);
        this.setCategory(category);
    }


    public DigitalVideoDisc(String title, String category, String director) {
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public boolean search(String title) {
        title = title.toLowerCase().trim();
        String thisTitle = this.getTitle().toLowerCase().trim();
        String[] titleSplitted = title.split(" ");
        String[] thisTitleSplitted = thisTitle.split(" ");
        for(String t: titleSplitted) {
            boolean check = false;
            for(String thisT: thisTitleSplitted) {
                if (thisT.equals(t)) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                return false;
            }
        }
        return true;
    }
}
