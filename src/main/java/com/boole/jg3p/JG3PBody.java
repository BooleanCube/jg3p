package com.boole.jg3p;

import javax.vecmath.Vector3f;
import java.util.ArrayList;

/**
 * <b>3D Kinematics Body Model for Java Graphics 3D Physics Library</b> <br>
 * <br>
 * Used to update the velocity and position of a celestial body by calculating the acceleration given a set of forces
 * and other bodies to take gravitational forces into account. <br>
 * Each {@link JG3PBody} object has a set of external forces attached to it in an {@link ArrayList<JG3PForce>}
 *
 * @author BooleanCube
 * @version v1.0.0
 *
 * @see #JG3PBody()
 * @see #JG3PBody(float, Vector3f)
 * @see #JG3PBody(float, Vector3f, Vector3f)
 */
public class JG3PBody {

    /**
     * Mass of the celestial body
     */
    private float mass;

    /**
     * Position of the center point of the celestial body in 3D space.
     */
    private Vector3f position;

    /**
     * Current velocity of the celestial body.
     */
    private Vector3f currentVelocity;

    /**
     * List of external forces (other than gravitational forces) exerted on the object.
     */
    private ArrayList<JG3PForce> forces;

    /**
     * Initialize a {@link JG3PBody} object with an initial velocity. <br>
     * <i>There are no external forces by default.</i>
     *
     * @param mass Float value of the mass of the kinematic body.
     * @param position {@link Vector3f} representing the location of the center point of the {@link JG3PBody}'s mass.
     * @param initialVelocity {@link Vector3f} representing a 3D velocity vector to indicate the initial velocity of
     *                                        the body.
     *
     * @since v1.0.0
     */
    public JG3PBody(float mass, Vector3f position, Vector3f initialVelocity) {
        this.setMass(mass);
        this.setPosition(position);
        this.setCurrentVelocity(initialVelocity);
        this.setForces(new ArrayList<JG3PForce>());
    }

    /**
     * Initialize a {@link JG3PBody} object without an initial velocity and just the mass and position of the body.
     * <i>There are no external forces by default.</i>
     *
     * @param mass Float value of the mass of the kinematic body.
     * @param position {@link Vector3f} representing the location of the center point of the {@link JG3PBody}'s mass.
     *
     * @since v1.0.0
     */
    public JG3PBody(float mass, Vector3f position) {
        this.setMass(mass);
        this.setPosition(position);
        this.setCurrentVelocity(new Vector3f(0f,0f,0f));
        this.setForces(new ArrayList<JG3PForce>());
    }

    /**
     * Initialize a {@link JG3PBody} object at the origin with no mass or initial velocity. <br>
     * <i>There are no external forces by default.</i>
     * <b>Note:</b> Gravitational forces from other bodies will have no effect on this body because there is no mass.
     *
     * @since v1.0.0
     */
    public JG3PBody() {
        this.setMass(0f);
        this.setPosition(new Vector3f(0f,0f,0f));
        this.setCurrentVelocity(new Vector3f(0f,0f,0f));
        this.setForces(new ArrayList<JG3PForce>());
    }

    /**
     * Mass of the {@link JG3PBody} object as a float value. <br>
     * <b>Note:</b> To set the mass of the body, use {@link #setMass(float) setMass(float)}
     *
     * @return float value with the mass of the body (in kilograms).
     *
     * @see #setMass(float)
     *
     * @since v1.0.0
     */
    public float getMass() {
        return mass;
    }

    /**
     * Location of the {@link JG3PBody} object as a {@link Vector3f}. <br>
     * <b>Note:</b> To set the position of the body, use {@link #setPosition(Vector3f) setPosition(Vector3)}
     *
     * @return {@link Vector3f} representing the location of the point at the body's center of mass in 3D space.
     *
     * @see #setPosition(Vector3f)
     *
     * @since v1.0.0
     */
    public Vector3f getPosition() {
        return position;
    }

    /**
     * Current Velocity of the {@link JG3PBody} object as a {@link Vector3f}. <br>
     * <b>Note:</b> To set the current velocity of the body, use {@link #setCurrentVelocity(Vector3f) setCurrentVelocity(Vector3)}
     *
     * @return {@link Vector3f} representing the current velocity of the body as a {@link Vector3f}.
     *
     * @see #setCurrentVelocity(Vector3f)
     *
     * @since v1.0.0
     */
    public Vector3f getCurrentVelocity() {
        return currentVelocity;
    }

    /**
     * List of the external {@link JG3PForce}s in a {@link JG3PBody} object. <br>
     * <b>Note:</b> To reset the external forces of the body, use {@link #setForces(ArrayList) setForces(new ArrayList<JG3PForce>())}
     *
     * @return A list of external forces being exerted on the body in a {@link ArrayList<JG3PForce>}.
     *
     * @see #setForces(ArrayList)
     * @see #addForce(JG3PForce)
     *
     * @since v1.0.0
     */
    public ArrayList<JG3PForce> getForces() {
        return forces;
    }

    /**
     * Set the mass float value of the {@link JG3PBody} object. <br>
     * <b>Note:</b> To retrieve the mass of the body, use {@link #getMass() getMass()}
     *
     * @param mass float value of the mass of the {@link JG3PBody}
     *
     * @see #getMass()
     *
     * @since v1.0.0
     */
    public void setMass(float mass) {
        this.mass = mass;
    }

    /**
     * Set the position {@link Vector3f} of the {@link JG3PBody} object. <br>
     * <b>Note:</b> To retrieve the location of the center of mass of the body, use {@link #getPosition() getPosition()}
     *
     * @param position The location of the center of mass of the {@link JG3PBody} graphed as a 3D vector.
     *
     * @see #getPosition()
     *
     * @since v1.0.0
     */
    public void setPosition(Vector3f position) {
        this.position = position;
    }

    /**
     * Set a {@link Vector3f} as the current velocity of the {@link JG3PBody} object. <br>
     * <b>Note:</b> To retrieve the current velocity of the body, use {@link #getCurrentVelocity() getCurrentVelocity()}
     *
     * @param currentVelocity The current velocity of the {@link JG3PBody} object.
     *
     * @see #getCurrentVelocity()
     *
     * @since v1.0.0
     */
    public void setCurrentVelocity(Vector3f currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    /**
     * Set the list of external {@link JG3PForce}s of the {@link JG3PBody} object. <br>
     * <b>Note:</b> To retrieve the list of external forces of the body, use {@link #getForces()}
     *
     * @param forces A list of external {@link JG3PForce}s enacted on the {@link JG3PBody}
     *
     * @see #getForces()
     * @see #addForce(JG3PForce)
     *
     * @since v1.0.0
     */
    public void setForces(ArrayList<JG3PForce> forces) {
        this.forces = forces;
    }

    /**
     * Add a singular external {@link JG3PForce} to the {@link JG3PBody} object.
     *
     * @param force A single external {@link JG3PForce} passed as a parameter to be added ot the list of external forces
     *              on this {@link JG3PBody}.
     *
     * @see #getForces()
     * @see #setForces(ArrayList)
     *
     * @since v1.0.0
     */
    public void addForce(JG3PForce force) {
        this.forces.add(force);
    }

    /**
     * Update the velocity of the {@link JG3PBody} object at every time frame. <br>
     * Pass in a parameter of all {@link JG3PBody}s in the simulation so that the current body takes all gravitational
     * forces into account. <br>
     *
     * @param bodies List of {@link JG3PBody}s in the simulation for the gravitational forces
     * @param time Time frame float value
     *
     * @see #getCurrentVelocity()
     * @see #setCurrentVelocity(Vector3f)
     * @see #updatePosition(float)
     *
     * @since v1.0.0
     */
    public void updateVelocity(ArrayList<JG3PBody> bodies, float time) {
        Vector3f acceleration = new Vector3f(0f,0f,0f);
        for(JG3PBody body : bodies) {
            if(this != body) {
                float dist = (float)Math.pow(this.calculateEuclideanDistance(body), 2);
                Vector3f forceDirection = new Vector3f(
                        body.getPosition().x-this.getPosition().x,
                        body.getPosition().y-this.getPosition().y,
                        body.getPosition().z-this.getPosition().z
                );
                forceDirection.normalize();
                forceDirection.setX(forceDirection.x * Universe.gravityConstant * body.getMass() * this.getMass() / dist);
                forceDirection.setY(forceDirection.y * Universe.gravityConstant * body.getMass() * this.getMass() / dist);
                forceDirection.setZ(forceDirection.z * Universe.gravityConstant * body.getMass() * this.getMass() / dist);
                acceleration.add(forceDirection);
            }
        }
        for(JG3PForce force : forces) {
            Vector3f direction = force.getDirection();
            direction.normalize();
            direction.setX(direction.x * force.getMagnitude());
            direction.setY(direction.y * force.getMagnitude());
            direction.setZ(direction.z * force.getMagnitude());
            acceleration.add(direction);
        }
        acceleration.setX(acceleration.x * time);
        acceleration.setY(acceleration.y * time);
        acceleration.setZ(acceleration.z * time);
        this.currentVelocity.add(acceleration);
    }

    /**
     * Update the position of {@link JG3PBody} based on the updated current velocity which is calculated every frame
     * before updating the position. <br>
     * <b>Note:</b> This doesn't move any objects in your simulation or application. It only changes the position
     * vector of the {@link JG3PBody} so further calculations can be made every frame.
     *
     * @param time Time frame float value
     *
     * @see #getPosition()
     * @see #setPosition(Vector3f)
     * @see #updateVelocity(ArrayList, float)
     *
     * @since v1.0.0
     */
    public void updatePosition(float time) {
        Vector3f velocity = new Vector3f(currentVelocity.x*time, currentVelocity.y*time, currentVelocity.z*time);
        this.getPosition().add(velocity);
    }

    /**
     * Calculates the Euclidean Distance between 2 {@link JG3PBody}s. <br>
     * Euclidean distance includes diagonal vectors unlike Manhattan Distance. <br>
     * <a href="https://s3-us-west-2.amazonaws.com/ist-app-support-files/000002228/00N39000003LL2C-0EM39000000wcQu.png">Euclidean Distance Example</a> <br>
     *
     * @param body Second {@link JG3PBody} to compare position to find euclidean distance.
     *
     * @return Euclidean Distance float value
     *
     * @see #calculateManhattanDistance(JG3PBody)
     *
     * @since v1.0.0
     */
    public float calculateEuclideanDistance(JG3PBody body) {
        return (float)Math.sqrt(
                Math.pow(body.getPosition().x-this.getPosition().x, 2) +
                Math.pow(body.getPosition().y-this.getPosition().y, 2) +
                Math.pow(body.getPosition().z-this.getPosition().z, 2)
        );
    }

    /**
     * Calculates the Manhattan Distance between 2 {@link JG3PBody}s. <br>
     * Manhattan distance does not include diagonal vectors unlike Euclidean Distance. <br>
     * <a href="https://www.101computing.net/wp/wp-content/uploads/taxicab-manhattan-grid-taxicab-distance.png">Manhattan Distance Example</a> <br>
     *
     * @param body Second {@link JG3PBody} to compare position to find manhattan distance.
     *
     * @return Manhattan Distance float value
     *
     * @see #calculateEuclideanDistance(JG3PBody)
     *
     * @since v1.0.0
     */
    public float calculateManhattanDistance(JG3PBody body) {
        return Math.abs(this.getPosition().x-body.getPosition().x) +
                Math.abs(this.getPosition().y-body.getPosition().y) +
                Math.abs(this.getPosition().z-body.getPosition().z);
    }

}
