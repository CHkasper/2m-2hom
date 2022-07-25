public class Computer extends Technics{
    private String CPU, GPU;
    private int RAM;

    public Computer(int releaseDate, String model, String name, String CPU, String GPU, int RAM) {
        super(releaseDate, model, name);
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    @Override
    public void print() {
        System.out.println("Дата выхода: " + getReleaseDate() +
                "\nМодель: " + getModel() +
                "\nНазвание" + getName() +
                "\nПроцессор: " + getCPU() +
                "\nГр. процессор: " + getGPU() +
                "\nОперативная память: " + getRAM() + "gb");
    }
}