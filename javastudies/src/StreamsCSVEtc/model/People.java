package StreamsCSVEtc.model;

import java.util.Date;


public class People {
    public String name;
    public String address;
    public String postcode;
    public String phone;
    public Float creditLimit;
    public Date birthday;

    public People(String name, String address, String postcode, String phone, Float creditLimit, Date birthday) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.creditLimit = creditLimit;
        this.birthday = birthday;
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

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", postcode=" + postcode +
                ", phone=" + phone +
                ", credit=" + creditLimit +
                ", birthday=" + birthday + '}'
                + "\n";
    }
}




