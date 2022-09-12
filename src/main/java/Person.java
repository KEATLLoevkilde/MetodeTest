public class Person {

    private double højde;
    private int alder;

    public Person (int alder, double højde) {
        this.højde = højde;
        this.alder = alder;
    }

    public double getHøjde() {
        return højde;
    }

    public int getAlder() {
        return alder;
    }

    public void setHøjde(double højde) {
        this.højde = højde;
    }

    public void harFødselsdag() {
        alder++;
    }
}
