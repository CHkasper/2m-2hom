public abstract class Technics implements Printable{
    private int releaseDate;
    private String model, name;

    public Technics(int releaseDate, String model, String name) {
        this.releaseDate = releaseDate;
        this.model = model;
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }
}