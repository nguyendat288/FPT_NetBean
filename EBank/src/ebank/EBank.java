package ebank;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EBank {

    private ResourceBundle labels;

    void setLocale(Locale locale) {
        labels = ResourceBundle.getBundle("text", locale );
    }

    public void input() {   
        Scanner sc = new Scanner(System.in);
        boolean inputState;
        String captcha = generateCaptcha();

        do {
            System.out.print(labels.getString("AccountNum"));
            String accountNum = sc.nextLine();
            String accountMessage = checkAccountNumber(accountNum);

            if (!(accountMessage.length() == 0)) {
                System.out.println(accountMessage);
                inputState = false;
            } else {
                inputState = true;
            }
        } while (!inputState);

        do {
            System.out.print(labels.getString("Password") );
            String password = sc.nextLine();
            String passwordMessage = checkPassword(password);

            if (!(passwordMessage.length() == 0)) {
                System.out.println(passwordMessage);
                inputState = false;
            } else {
                inputState = true;
            }
        } while (!inputState);

        System.out.println(labels.getString("Captcha")  + captcha);
        do {
            System.out.print(labels.getString("InputCaptcha") );
            String captchaInput = sc.nextLine();
            String message = checkCaptcha(captcha, captchaInput);
            if (message.length() > 0) {
                inputState = false;
                System.out.println(labels.getString("CaptchaInvalid"));
                System.out.println(labels.getString("ReEnterCaptcha"));
            } else if (message.length() == 0) {
                inputState = true;
            }
        } while (!inputState);
        System.out.println(labels.getString("Logged") + "! ٩(^‿^)۶");
    }

    public String checkAccountNumber(String accountNumber) {
        if (!accountNumber.matches("([0-9]){10}")) {
            String message = labels.getString("AccountNumInvalid");
            return message;
        }
        return "";
    }

    public String checkPassword(String password) {
        if (!password.matches("((?=.*\\d)(?=.*[a-zA-Z])[a-zA-Z\\d]{8,31})")) {
            String message = labels.getString("PasswordInvalid");
            return message;
        }
        return "";
    }

    public String checkCaptcha(String captcha, String captchaInput) {
        if (captchaInput.length() == 0) {
            return labels.getString("CaptchaInvalid");
        }else if(captcha.contains(captchaInput)){
            return "";
        }
        else
        return labels.getString("CaptchaInvalid");
    }

    public String generateCaptcha() {
        char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char captcha[] = new char[7];

        Random r = new Random();

        for (int i = 0; i < (captcha.length); i++) {
            int ran = r.nextInt(data.length);
            captcha[i] = data[ran];
        }
        return new String(captcha);
    }
}
