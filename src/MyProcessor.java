public class MyProcessor {

    private String naming;
    private int numberCores;
    private double frequencies;

    public MyProcessor(String naming, int numberCores, double frequencies) {
        this.naming = naming;
        this.numberCores = numberCores;
        this.frequencies = frequencies;
    }

    public String getNaming(String intel) {
        return naming;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public double getFrequencies() {
        return frequencies;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    public void setFrequencies(double frequencies) {
        this.frequencies = frequencies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyProcessor that)) return false;
        return getNumberCores() == that.getNumberCores() && Double.compare(that.getFrequencies(), getFrequencies()) == 0 && naming.equals(that.naming);
    }


    @Override
    public String toString() {
        return "myProcessor{" +
                "naming='" + naming + '\'' +
                ", numberCores=" + numberCores +
                ", frequencies=" + frequencies +
                '}';
    }
}
