import java.time.Year;

public class DrivingLicence {
    private String name;
    private String surname;
    private String adress;
    private Integer year;

    public DrivingLicence (String name, String surname, String adress, Integer year) {
        this.setName(name);
        this.setSurname(surname);
        this.setAdress(adress);
        this.setYear(year);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            this.name = name;
        }
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getAdress(){
        return adress;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public Integer getYear(){
        return year;
    }

    public void setYear(Integer year){
        int currentYear = Year.now().getValue();
        if (year >= 1980 && year <= currentYear) {
            this.year = year;
    }
}
}