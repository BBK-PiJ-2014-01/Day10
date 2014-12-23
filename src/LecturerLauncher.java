/**
 * Created by Pierre on 28/11/2014.
 * Code complete
 */
public class LecturerLauncher {

    public static void main(String[] args) {
        LecturerLauncher launcher = new LecturerLauncher();
        launcher.launch();
    }

    public void launch() {
        Lecturer l1 = new Lecturer("John");
        l1.teach("Mathematics");
        l1.doResearch("Infinite spaces");
    }
}
