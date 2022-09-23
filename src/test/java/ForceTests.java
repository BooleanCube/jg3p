import com.boole.jg3p.JG3PForce;
import org.junit.Assert;
import org.junit.Test;

import javax.vecmath.Vector3f;

public class ForceTests {

    @Test
    public void forceTests() {
        JG3PForce force1 = new JG3PForce(new Vector3f(1f,2f,3f), 4f);

        Assert.assertEquals("Error occurred in normalizing direction vector for the force vector.",
                0.26726124f, force1.getDirection().x, 0.001f);
        Assert.assertEquals("Error occurred in normalizing direction vector for the force vector.",
                0.5345225f, force1.getDirection().y, 0.001f);
        Assert.assertEquals("Error occurred in normalizing direction vector for the force vector.",
                0.8017837f, force1.getDirection().z, 0.001f);

        Assert.assertEquals("Error occurred in normalizing direction vector because length isn't equal to 1.",
                1f, force1.getDirection().length(), 0.001f);

        Assert.assertEquals("Magnitude initialization went wrong.", 4f, force1.getMagnitude(), 0.001f);
    }

}
