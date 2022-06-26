package StreamsCSVEtc;

public class People {
    private final String name;
    private final String address;
    private final String postcode;
    private final String phone;
    private final String creditLimit;
    private final String birthday;
    private final String gender;

    public People(String name, String address, String postcode, String phone, String creditLimit, String birthday, String gender) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.creditLimit = creditLimit;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", postcode=" + postcode +
                ", phone=" + phone +
                ", credit=" + creditLimit +
                ", birthday=" + birthday +
                ", gender=" + gender +
                '}' +
                "\n";
    }
}




