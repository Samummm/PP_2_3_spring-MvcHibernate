package web.model;

public class Car {

    private String vin;
    private String model;
    private Integer yearIssue;

    public Car() {
    }

    public Car(String vin, String model, Integer yearIssue) {
        this.vin = vin;
        this.model = model;
        this.yearIssue = yearIssue;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(Integer yearIssue) {
        this.yearIssue = yearIssue;
    }
}

