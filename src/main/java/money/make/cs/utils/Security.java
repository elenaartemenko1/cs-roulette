package money.make.cs.utils;

import java.util.Random;

public class Security {
    public boolean getAdminAccess(User user) {
        switch (user.getAccess()) {
            case "admin":
                System.out.println(user.getAccess());
                return true;

            default:
                System.out.println(user.getAccess());
                return false;

        }


    }

    public boolean getAge(User user) {
        if (user.getAge() < 18) {
            System.out.println(user.getAge());
            return false;
        }
        System.out.println(user.getAge());
        return true;
    }

    public static void main(String[] args) {
        Security security = new Security();

        Random random = new Random();
        User user = new User("Lena", "Kolena", 19, "admin");
        security.getAdminAccess(user);

        security.getAge(user);


    }


}

