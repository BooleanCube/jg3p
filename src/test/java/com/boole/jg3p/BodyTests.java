package com.boole.jg3p;

import org.junit.Assert;
import org.junit.Test;

import javax.vecmath.Vector3f;
import java.util.ArrayList;
import java.util.List;

public class BodyTests {

    @Test
    public void bodyTests() {
        JG3PBody body1 = new JG3PBody();
        JG3PBody body2 = new JG3PBody(10000f, new Vector3f(1000f,0f,10f));
        JG3PBody body3 = new JG3PBody(1000f, new Vector3f(-100f,0f,0f), new Vector3f(-10f,0f,0f));
        ArrayList<JG3PBody> bodies = new ArrayList<>(List.of(new JG3PBody[]{body1, body2, body3}));

        System.out.println(body2.getCurrentVelocity());
        body2.updateVelocity(bodies, Universe.timeStep);
        System.out.println(body2.getCurrentVelocity());
        System.out.println(body2.getPosition());
        body2.updatePosition(Universe.timeStep);
        System.out.println(body2.getPosition());

        //Assert.assertEquals("updating velocity does not work");
    }

}
