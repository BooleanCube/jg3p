package com.boole.jg3p;

/**
 * <b>Universal Constants that can be configured to your own preference.</b> <br>
 * <br>
 * 3D Physics constants that can be used universally throughout all {@link JG3PForce}s and {@link JG3PBody}s in the
 * project.
 */
public class Universe {

    /**
     * <b>Universal Gravitational Constant</b> <br>
     * Default Value = 6.6743 × 10^(-11) m^3 kg^(-1) s^(-2) <br>
     * Used to calculate the gravitational forces of each celestial body.
     */
    public static float gravityConstant = 0.0000000000667259f;

    /**
     * Float value representing the time between each step to update velocity and position of each celestial body.
     * Default Value = 0.01f
     */
    public static float timeStep = 0.01f;

}
