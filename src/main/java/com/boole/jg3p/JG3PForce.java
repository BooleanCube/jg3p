package com.boole.jg3p;

import javax.vecmath.Vector3f;

/**
 * <b>Force Model for the Java Graphics 3D Physics Library</b> <br>
 * <br>
 * {@link JG3PForce} objects can be used to represent external forces (other than gravitational forces) to update the
 * velocity of a {@link JG3PBody} object. After initialization of the {@link JG3PForce} object, direction and magnitude
 * can not be changed or set to be different.
 *
 * @author BooleanCube
 * @version v1.0.0
 *
 * @see #JG3PForce(Vector3f, float)
 */
public class JG3PForce {

    /**
     * Direction of the force vector
     */
    private Vector3f direction;

    /**
     * Magnitude of the force vector
     */
    private float magnitude;

    /**
     * Initialize a {@link JG3PForce} object with a given direction and magnitude. <br>
     *
     * @param direction {@link Vector3f} object indicating the direction of the force vector representing the
     *                  {@link JG3PForce} object. <br>
     *                  The direction vector is automatically normalized in the constructor, so the
     *                  direction vector passed in doesn't need to be normalized already.
     * @param magnitude The magnitude of the force vector represented by the {@link JG3PForce} object.
     *
     * @see #getDirection()
     * @see #getMagnitude()
     *
     * @since v1.0.0
     */
    public JG3PForce(Vector3f direction, float magnitude) {
        this.setDirection(direction);
        this.setMagnitude(magnitude);
    }

    /**
     * The {@link Vector3f} object used to represent the direction of the force vector created in the {@link JG3PForce}
     * object.
     *
     * @return {@link Vector3f} object with the normalized vector representing the direction of the force vector.
     *
     * @see #getMagnitude()
     *
     * @since v1.0.0
     */
    public Vector3f getDirection() {
        return direction;
    }

    /**
     * The float value of the magnitude of the force vector representing the {@link JG3PForce} object.
     *
     * @return The length/magnitude of the force vector drawn by the current {@link JG3PForce} object.
     *
     * @see #getDirection()
     *
     * @since v1.0.0
     */
    public float getMagnitude() {
        return magnitude;
    }

    /**
     * Normalizes the direction vector and sets the direction vector to the normalized vectored passed in as the
     * parameter.
     * One time usage in the constructor.
     *
     * @param direction Normalized direction vector of the force.
     *
     * @since v1.0.0
     */
    private void setDirection(Vector3f direction) {
        direction.normalize();
        this.direction = direction;
    }

    /**
     * Sets the magnitude of the force vector.
     * One time usage in the constructor.
     *
     * @param magnitude Magnitude of the force vector as a float value.
     *
     * @since v1.0.0
     */
    private void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

}
