package org.ismailcet.builderpatterns;

/**
 * Hello world!
 *
 */
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
