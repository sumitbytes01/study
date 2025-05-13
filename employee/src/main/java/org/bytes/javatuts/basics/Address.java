package org.bytes.javatuts.basics;

public class Address {
  private  String addressLine1;
   private String city;
   private String country;
    private int pincode;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Override
    public String toString() {
        return "org.bytes.javatuts.basics.Address{" +
                "addressline1='" + addressLine1 + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String addressline1, String city, String country, int pincode){
            this.addressLine1 = addressline1;
            this.city = city;
            this.country = country;
            this.pincode = pincode;
        }

    }

