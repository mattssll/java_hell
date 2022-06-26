package StreamsCSVEtc.Models;


import java.util.Date;

public class People {
    private String name;
    private String address;
    private String postcode;
    private String phone;
    private Float creditLimit;
    private Date birthday;
    private String gender;

    public People(String name, String address, String postcode, String phone, Float creditLimit, Date birthday, String gender) {
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

    public Date getBirthday() {
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




