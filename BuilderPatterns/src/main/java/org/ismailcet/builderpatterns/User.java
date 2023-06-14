package org.ismailcet.builderpatterns;

public class User {
    private String name;
    private String surname;
    private String email;

    public User(Builder builder){
        name = builder.name;
        surname = builder.surname;
        email = builder.email;
    }

    public static class Builder{
        private String name;
        private String surname;
        private String email;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
