package com.example.scientificcalculator.ui.main;

    /*
     * Common basic biology formulas.
     */
public class BiologyFormulas {
    /*
     * Concentration equation.
     * returns the unknown variable in the equation.
     * @param initialC - initial concentration of a solution in Molar
     * @param initialV - initial volume of the solution in liters
     * @param finalC - final concentration of the solution in Molar
     * @param finalV - final volume of the solution in liters
     */
    public Double concetrationEq(Double initialC, Double initialV, Double finalC, Double finalV) {
        if (initialC == null) {
            initialC = (finalC * finalV) / initialV;
            return initialC;
        } else if (initialV == null) {
            initialV = (finalC * finalV) / initialC;
            return initialV;
        } else if (finalC == null) {
            finalC = (initialC * initialV) / finalV;
            return finalC;
        } else if (finalV == null) {
            finalV = (initialC * initialV) / finalC;
            return finalV;
        } else {
            throw new IllegalArgumentException();
        }
    }
    /*
     * Hardy Weinberg Law.
     * returns the unknown/null variable in the equation.
     * @param p - frequency of the dominant allele in a population
     * @param q - frequency of the recessive allele in a population
     */
    public Double hardyWeinbergEq(Double p, Double q) {
        if (p == null) {
            p = 1 - q;
            return p;
        } else if (q == null) {
            q = 1 - p;
            return q;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
