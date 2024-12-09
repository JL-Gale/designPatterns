public class AutoBmw {
    private static AutoBmw instance;
    private String model;
    private String year;

    private AutoBmw() {}

    public static AutoBmw getInstance(){
        if (instance == null) {
            instance = new AutoBmw();
            return instance;
        }
        return instance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
