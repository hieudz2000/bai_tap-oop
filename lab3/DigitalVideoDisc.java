package lab3;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public void setTitle(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String tile, String category, String director, int lenght, float cost) {
        this.title = tile;
        this.category = category;
        this.director = director;
        this.length = lenght;
        this.cost = cost;
    }
    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public DigitalVideoDisc(String tile, String category,float cost) {
        this.title = tile;
        this.category = category;
        this.length = 0;
        this.cost = cost;
    }
    public int getLength() {
        return length;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }


}

