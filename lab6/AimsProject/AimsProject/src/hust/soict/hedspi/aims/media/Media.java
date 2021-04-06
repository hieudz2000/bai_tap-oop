package hust.soict.hedspi.aims.media;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Media {
    private static List<Media> listMedia = new ArrayList<>();
    private int id;
    private String title;
    private String category;
    private float cost;

    public static List<Media> getListMedia() {
        return listMedia;
    }

    public Media() {
        Media.listMedia.add(this);
        this.id = Media.listMedia.size() + 1;
    }

    public Media(String title) {
        Media.listMedia.add(this);
        this.id = Media.listMedia.size() + 1;
        this.title = title;
    }


    public Media(String title, String category) {
        Media.listMedia.add(this);
        this.id = Media.listMedia.size() + 1;
        this.title = title;
        this.category = category;

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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public static Media getMedia(int id) {
        return Media.listMedia.get(id - 1);
    }
}
