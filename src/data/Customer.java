package data;

public class Customer {
    String name;
    String address;
    int mobileNo;
    String email;
    boolean premiumMembership;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPremiumMembership(boolean premiumMembership) {
        this.premiumMembership = premiumMembership;
    }
    public boolean isPremiumMembership() {
        return premiumMembership;
    }


}
