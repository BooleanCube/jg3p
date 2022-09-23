import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        runForceTests();
        runBodyTests();
    }

    static void runForceTests() {
        Result result = JUnitCore.runClasses(ForceTests.class);
        System.out.println("JG3PForce Testing =>");
        for(Failure failure : result.getFailures())
            System.out.println("---> " + failure.toString());
        System.out.println(result.wasSuccessful() ? "Successful!" : "Failed!");
    }

    static void runBodyTests() {
        Result result = JUnitCore.runClasses(BodyTests.class);
        System.out.println("JG3PBody Testing =>");
        for(Failure failure : result.getFailures())
            System.out.println("---> " + failure.toString());
        System.out.println(result.wasSuccessful() ? "Successful!" : "Failed!");
    }

}
