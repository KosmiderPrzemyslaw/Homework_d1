/*
1. Napisz metodę `static boolean verifyLogin(String email)`,
która zwróci **true** jeżeli ciąg znaków:
    * Ma minimum 5 znaków.
    * Zawiera tylko litery, cyfry, znak podkreślenia, myślnik
    * Nie zaczyna się od cyfry
 */

package Zad_dom_dzień_1;

import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(verifyLogin("mail-o2.pl"));
        System.out.println(verifyLogin("somemail@gmail.com"));
        System.out.println(verifyLogin("4111wp.pl"));

    }

    static boolean verifyLogin(String email) {
        return Pattern.matches("^[a-zA-Z_-]{1}[a-zA-Z0-9_-]{4,}$", email);
    }

}
