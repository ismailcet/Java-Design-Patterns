# Buiilder Pattern

## Explanation

---

> Separate the construction of a complex object from its representation so that same construction 
> process can create different representation 

## Programmatic Example

First of all, we have an user object that we want to create
```java
public class User {
    private String name;
    private String surname;
    private String email;

    public User(Builder builder){
        name = builder.name;
        surname = builder.surname;
        email = builder.email;
    }
}
```

Then we create builder 
```java
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
```

And we can used in main method

```java
public class BuilderMake
{
    public static void main( String[] args ) {
        User user = new User.Builder()
                .name("Test-Name")
                .surname("Test-Surname")
                .email("Test-Email")
                .build();

        System.out.println(user);
    }
}
```
And Console Output
```
User{name='Test-Name', surname='Test-Surname', email='Test-Email'}
```