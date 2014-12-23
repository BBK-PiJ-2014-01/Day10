/**
 * Created by Pierre on 27/11/2014.
 * Code complete
 */
public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch() {
        SmartPhone sp = new SmartPhone("Nokia");
        sp.call("0203 128 2441");
        sp.call("0203 128 2321");
        sp.call("00 203 128 2222");
        sp.call("0203 128 2981");
        sp.ringAlarm("Time to get up!");
        sp.playGame("Hay Day");
        sp.browseWeb("www.aaa.com");
        String position = sp.findPosition();
        System.out.println(position);
        sp.printLastNumbers();
        System.out.println("Brand: " + sp.getBrand());
    }
}
