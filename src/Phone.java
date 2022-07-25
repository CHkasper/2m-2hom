public class Phone extends Technics {
    private String operatingSystem;
    private int memory;

    public Phone(int releaseDate, String model, String name, String operatingSystem, int memory) {
        super(releaseDate, model, name);
        this.operatingSystem = operatingSystem;
        this.memory = memory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void print() {
        System.out.println("Дата выхода: " + getReleaseDate() +
                "\nМодель: " + getModel() +
                "\nНазвание" + getName() +
                "\nОперационная система: " + getOperatingSystem() +
                "\nПамять: " + getMemory() + "gb");
    }
}
