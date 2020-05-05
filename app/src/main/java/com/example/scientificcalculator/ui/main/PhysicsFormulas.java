package com.example.scientificcalculator.ui.main;

    /*
     * Common basic physics equations.
     */
public class PhysicsFormulas {
    /*
     * Newton's second law motion equation.
     * returns the unknown/null variable in the equation.
     * @param capF - capital F, force in Newton.
     * @param m - mass of the object in kg.
     * @param a - acceleration of the object in m/s^2.
     */
    public Double motionEq(Double capF, Double m, Double a) {
        if (capF == 0 && m != 0 && a != 0) {
            capF = m * a;
            return capF;
        } else if (m == 0 && capF != 0 && a != 0) {
            m = capF / a;
            return m;
        } else if (a == 0 && capF != 0 && m != 0) {
            a = capF / m;
            return a;
        }
        return 0.0;
    }
    /*
     * Newton's Law of gravitation equation.
     * returns the unknown/null variable in the equation.
     * capG is a constant and equal to 6.67x10^-11 in the units of the following.
     * @param capF - capital F is the force between the objects, in Newton.
     * @param firstMass - one of the masses in kg.
     * @param secondMass - the other mass in kg.
     * @param r - radius of the mass or the distance in meters.
     */
    public Double gravitationEq(Double capF, Double firstMass, Double secondMass, Double r) {
        Double capG = 6.67 * Math.pow(10, -11);
        if (capF == 0 && firstMass != 0 && secondMass != 0 && r != 0) {
            capF = (capG * firstMass * secondMass) / Math.pow(r, 2);
            return capF;
        } else if (firstMass == 0 && capF != 0 && secondMass != 0 && r != 0) {
            firstMass = (capF * Math.pow(r, 2)) / (capG * secondMass);
            return firstMass;
        } else if (secondMass == 0 && capF != 0 && firstMass != 0 && r != 0) {
            secondMass = (capF * Math.pow(r, 2)) / (capG * firstMass);
            return secondMass;
        } else if (r == 0 && capF != 0 && firstMass != 0 && secondMass != 0) {
            r = Math.sqrt((capG * firstMass * secondMass) / capF);
            return r;
        }
        return 0.0;
    }
    /*
     * The following methods contain the common dynamics equations.
     * All one letter symbols will remain the same for the dynamics equations.
     * @param v - velocity of the moving object in m/s
     * @param v0 - initial velocity of the moving object in m/s
     * @param a - acceleration of the object in m/s^2
     * @param t - time in seconds
     * @param deltaX - change in distance in meters
     */
    public Double dynamicsEq1(Double v, Double v0, Double a, Double t) {
        if (v == null) {
            v = v0 + (a * t);
            return v;
        } else if (v0 == null) {
            v0 = v - (a * t);
            return v0;
        } else if (a == null) {
            a = (v - v0) / t;
            return a;
        } else if (t == null) {
            t = (v - v0) / a;
            return t;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public Double dynamicsEq2(Double deltaX, Double v, Double v0, Double t) {
        if (deltaX == null) {
            deltaX = ((v + v0) / 2) * t;
            return deltaX;
        } else if (v == null) {
            v = ((deltaX / t) * 2) - v0;
            return v;
        } else if (v0 == null) {
            v0 = ((deltaX / t) * 2) - v;
            return v0;
        } else if (t == null) {
            t = (2 * deltaX) / (v + v0);
            return t;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public Double dynamicsEq3(Double deltaX, Double v0, Double t, Double a) {
        if (deltaX == null) {
            deltaX = (v0 * t) + (0.5 * a * Math.pow(t, 2));
            return deltaX;
        } else if (v0 == null) {
            v0 = (deltaX - (0.5 * a * Math.pow(t, 2)) / t);
            return v0;
        } else if (t == null) {
            t = (deltaX - (0.5 * a * Math.pow(t, 2)) / v0);
            return t;
        } else if (a == null) {
            a = (deltaX - (v0 * t)) * (2 / Math.pow(t, 2));
            return a;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public Double dynamicsEq4(Double v, Double v0, Double a, Double deltaX) {
        if (v == null) {
            v = Math.sqrt(Math.pow(v0, 2) + (2 * a * deltaX));
            return v;
        } else if (v0 == null) {
            v0 = Math.sqrt(Math.pow(v, 2) - (2 * a * deltaX));
            return v0;
        } else if (a == null) {
            a = (Math.pow(v, 2) - Math.pow(v0, 2)) / (2 * deltaX);
            return a;
        } else if (deltaX == null) {
            deltaX = (Math.pow(v, 2) - Math.pow(v0, 2)) / (2 * a);
            return deltaX;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
