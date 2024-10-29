package TDD;

public class PasswordCheck {
    public boolean check(String password) {


        boolean enoughCharacters = false;
        boolean hasDigits = false;


        if (password.length() >= 8) {
            enoughCharacters = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigits = true;
            }
        }

        return enoughCharacters && hasDigits;
        }
    }


