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
        if (initialC == 0 && initialV != 0 && finalC != 0 && finalV != 0) {
            initialC = (finalC * finalV) / initialV;
            return initialC;
        } else if (initialV == 0 && initialC != 0 && finalC != 0 && finalV != 0) {
            initialV = (finalC * finalV) / initialC;
            return initialV;
        } else if (finalC == 0 && initialC != 0 && initialV != 0 && finalV != 0) {
            finalC = (initialC * initialV) / finalV;
            return finalC;
        } else if (finalV == 0 && initialC != 0 && initialV != 0 && finalC != 0) {
            finalV = (initialC * initialV) / finalC;
            return finalV;
        }
        return 0.0;
    }
    /*
     * Hardy Weinberg Law.
     * returns the unknown/null variable in the equation.
     * @param p - frequency of the dominant allele in a population
     * @param q - frequency of the recessive allele in a population
     */
    public Double hardyWeinbergEq(Double p, Double q) {
        if (p == 0 && q >= 0 && q <= 1) {
            p = 1 - q;
            return p;
        } else if (q == 0 && p >= 0 && p <= 1) {
            q = 1 - p;
            return q;
        }
        return 0.0;
    }
}
