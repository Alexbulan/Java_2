package ru.mirea.it.ivbo;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, housing, flat;

    public Address(String address, boolean flag){
        if(address == null)
            throw new NullPointerException("There is not enough data in the address!");
        String[] addressCurr;
        if(flag){
            StringTokenizer st = new StringTokenizer(address, ",.;");
            addressCurr = new String[st.countTokens()];
            int i = 0;
            while(st.hasMoreTokens()) addressCurr[i++] = st.nextToken();
        }else{
            addressCurr = address.split(",");
        }

        if(addressCurr.length < 7)
            throw new IllegalArgumentException("There is not enough data in the address!");
        country = addressCurr[0].trim();
        region = addressCurr[1].trim();
        city = addressCurr[2].trim();
        street = addressCurr[3].trim();
        house = addressCurr[4].trim();
        housing = addressCurr[5].trim();
        flat = addressCurr[6].trim();
    }

    @Override
    public String toString() {
        return "Address: " + country + "\t " + region + "\t " + city + "\t " + street + "\t " +  house + "\t " +  housing + "\t " + flat;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Russia, Moscow, Moscow, Vernadsky avenue, 78, 1, -", false);
        System.out.println(address1);
        Address address2 = new Address("Russia, Tyumen, Lotoshino, Lenin Passage, 1, -, 100", false);
        System.out.println(address2);
    }
}
