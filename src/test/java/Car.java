public class Car {

    private int qtyWheels;
    private int qtyLigths;
    private int doors;
    private String prefixDomain;
    private boolean turnedOn;
    private String brand;
    private String fullDomain;
    private final String CHASIS_NUM = "ASDFG12345QWERT";

    /** Constructor **/

    public Car(int qtyWheels, int qtyLigths, int doors, String prefixDomain, boolean turnedOn, String brand, String fullDomain) {
        this.qtyWheels = qtyWheels;
        this.qtyLigths = qtyLigths;
        this.doors = doors;
        this.prefixDomain = prefixDomain;
        this.turnedOn = turnedOn;
        this.brand = brand;
        this.fullDomain = fullDomain;
    }

    /** Getters **/

    public int getQtyWheels() {
        return qtyWheels;
    }

    public int getQtyLigths() {
        return qtyLigths;
    }

    public int getDoors() {
        return doors;
    }

    public String getPrefixDomain() {
        return prefixDomain;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public String getBrand() {
        return brand;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public String getCHASIS_NUM() {
        return CHASIS_NUM;
    }

    /** Setters **/

    public void setQtyWheels(int qtyWheels) {
        this.qtyWheels = qtyWheels;
    }

    public void setQtyLigths(int qtyLigths) {
        this.qtyLigths = qtyLigths;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setPrefixDomain(String prefixDomain) {
        this.prefixDomain = prefixDomain;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }
}
