package exercicio03;

public class Agenda {
    private String name;
    private String phoneNumber;
    private String address;
    private String zone;

    public Agenda(String name, String phoneNumber, String address, String zone) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.zone = zone;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getZone() {
        return zone;
    }
}
