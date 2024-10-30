public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence("John", "Jackson", "Lenina 15", 2023);
        System.out.println("---Information about the driving licence---");
        System.out.println(dl.getName());
        System.out.println(dl.getSurname());
        System.out.println(dl.getAdress());
        System.out.println(dl.getYear());
        System.out.println("--------------");
    }

}
