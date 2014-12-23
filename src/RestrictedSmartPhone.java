/**
 * Created by Pierre on 28/11/2014.
 * Code complete
 */
public class RestrictedSmartPhone extends MobilePhone {

    public RestrictedSmartPhone (String brand) {
        super(brand);
    }

    @Override
    public void call(String number) {
        if (number.substring(0,2).equals("00"))
            System.out.println("Calling " + number +" through the internet to save money");
        else
            super.call(number);
    }

    public void browseWeb(String webLink) {
        System.out.println("Browsing the website: " + webLink);
    }

    public String findPosition() {
        return("GPS Position: 111-222-333");
    }

    /* Exercise 4.2: Cannot downgrade the access set in the superclass

    @Override
    private void playGame(String game) {
        System.out.println("Game launched: " + game);
    }

    */


}
