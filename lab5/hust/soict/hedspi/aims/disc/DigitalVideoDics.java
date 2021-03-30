package hust.soict.hedspi.aims.disc;

import java.util.Locale;

public class DigitalVideoDics {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDics() {
    }

    public DigitalVideoDics(String title) {
        this.title = title;

    }

    public DigitalVideoDics(String title, String category) {
        this.title = title;
        this.category = category;
    }


    public DigitalVideoDics(String title, String category, String director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public DigitalVideoDics(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean search(String title) {
        title = title.toLowerCase();
        String thisTitle = this.title.toLowerCase().trim();
        thisTitle = thisTitle.toLowerCase().trim();
        String[] titleSplitted = title.split(" ");
        String[] thisTitleSplitted = thisTitle.split(" ");
        int a = 0;
        for (int i = 0; i < titleSplitted.length; i++) {
            for (int j = 0; j < thisTitleSplitted.length; j++) {
                if (thisTitleSplitted[j].equals(titleSplitted[i])) {
                    ++a;
                    break;
                }
            }
            if (a == thisTitleSplitted.length) {
                return true;
            }
        }

        return false;
    }
}
