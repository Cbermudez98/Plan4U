package Model;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String dateBirth;
    private Byte profileImage;

    public User() {
    }

    public User(String name, String lastName, String email, String phone, String address, String city, String dateBirth, Byte profileImage) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.dateBirth = dateBirth;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Byte getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Byte profileImage) {
        this.profileImage = profileImage;
    }
}
