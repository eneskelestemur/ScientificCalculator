package com.example.scientificcalculator.ui.main;
import java.lang.Math;
import java.lang.Double;

    /*
     * Common basic chemistry formulas.
     */
public class ChemistryFormulas {
    /*
     * Ideal gas equation.
     * returns the unknown/null variable in the equation.
     * capR is a constant and the unit is formed by the following specific units.
     * @param capP - capital P symbolizes pressure in atm
     * @param capV - capital V symbolizes volume in liters
     * @param n - lower case n symbolizes number of moles in mol
     * @param capT - capital T symbolizes temperature in kelvin
     */
    public Double idealGasEq(Double capP, Double capV, Double n, Double capT) {
        final double capR = 0.08206;
        if (capP == null) {
            capP = (n * capR * capT) / capV;
            return capP;
        } else if (capV == null) {
            capV = (n * capR * capT) / capP;
            return capV;
        } else if (n == null) {
            n = (capP * capV) / (capR * capT);
            return n;
        } else if (capT == null) {
            capT = (capP * capV) / (capR * n);
            return capT;
        } else {
            throw new IllegalArgumentException();
        }
    }
    /*
     * Density equation.
     * returns the unknown/null variable in the equation.
     * @param d - density in g/cm3
     * @param m - mass in grams
     * @param capV - capital V, volume in cm3
     */
    public Double densityEq(Double d, Double m, Double capV) {
        if (d == null) {
            d = m / capV;
            return d;
        } else if (m == null) {
            m = d * capV;
            return m;
        } else if (capV == null) {
            capV = m / d;
            return capV;
        } else {
            throw new IllegalArgumentException();
        }
    }
    /*
     * Number of moles equation.
     * returns the unknown variable in the equation.
     * @param n - number of moles in moles.
     * @param m - mass of compound in grams
     * @param capM - molecular weight of compound in g/mol
     */
    public Double numberOfMolesEq(Double n, Double m, Double capM) {
        if (n == null) {
            n = m / capM;
            return n;
        } else if (m == null) {
            m = n * capM;
            return m;
        } else if (capM == null) {
            capM = m / n;
            return capM;
        } else {
            throw new IllegalArgumentException();
        }
    }
    /*
     * Planck's equation.
     * returns the unknown variable in the equation.
     * h is the planck's constant and equal to 6.626x10^-34 J*s
     * @param capE - Energy in joules
     * @param v - nu symbol, frequency in 1/s
     */
    public Double plancksEq(Double capE, Double v) {
        final double h = 6.626 * Math.pow(10, -34);
        if (capE == null) {
            capE = h * v;
            return capE;
        } else if (v == null) {
            v = capE / h;
            return v;
        } else {
            throw new IllegalArgumentException();
        }
    }
    /*
     * Conversion from frequency and wavelength.
     * returns the unknown/null variable in the equation.
     * c is the speed of light and a constant, c = 2.998x10^8 m/s
     * @param lambda - wavelength in meters
     * @param v - nu symbol, frequency in 1/s
     */
    public Double conversionBetweenFreqAndLambda(Double lambda, Double v) {
        final Double c = 2.998 * Math.pow(10, 8);
        if (lambda == null) {
            lambda = c / v;
            return lambda;
        } else if (v == null) {
            v = c / lambda;
            return lambda;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
