package de.claus.pattern.builder;
/**
 * 
 * @author claus
 *
 */
public class Partner 
{
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
 
    private Partner(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }
 
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
 
    @Override
    public String toString() {
        return "Partner: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
 
    public static class Builder 
    {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;
 
        public static Builder newInstance() {
        	return new Builder();
        }
        private Builder() {
        	
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Partner build() {
        	Partner partner =  new Partner(this);
            validatePartnerObject(partner);
            return partner;
        }
        private void validatePartnerObject(Partner partner) {
        		//Prüfungen
        }
    }
}
