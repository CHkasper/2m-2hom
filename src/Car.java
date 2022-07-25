public class Car extends Technics{
    private int volume;
    private String bodyView;

    public Car(int releaseDate, String model, String name, int volume, String bodyView) {
        super(releaseDate, model, name);
        this.volume = volume;
        this.bodyView = bodyView;
    }

    public int getVolume() {
        return volume;
    }

    public String getBodyView() {
        return bodyView;
    }

    @Override
    public void print() {
        System.out.println("Дата выхода: " + getReleaseDate() +
                "\nМодель: " + getModel() +
                "\nНазвание: " + getName() +
                "\nОбъем: " + getVolume() +
                "\nКласс машины: " + getBodyView());
    }
}