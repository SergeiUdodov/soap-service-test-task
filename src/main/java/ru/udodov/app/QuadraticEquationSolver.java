package ru.udodov.app;

import jakarta.ejb.Stateless;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ru.udodov.exeptions.DiscriminantException;

@Stateless
@WebService
public class QuadraticEquationSolver {

    @WebMethod
    public QuadraticSolution solveEquation(@WebParam(name = "a") double a,
                                           @WebParam(name = "b") double b,
                                           @WebParam(name = "c") double c) throws DiscriminantException {
        if (a == 0) {
            throw new IllegalArgumentException("Parameter 'a' should not be zero.");
        }

        double D = b * b - 4 * a * c;
        String formula = String.format("%.0fx^2 + %.0fx + %.0f = 0", a, b, c);

        if (D < 0) {
            throw new DiscriminantException("Discriminant is negative", formula, D);
        }

        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        QuadraticSolution solution;

        if (D == 0) {
            solution = new QuadraticSolution(formula, D, x1, null);
        } else {
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            solution = new QuadraticSolution(formula, D, x1, x2);
        }

        return solution;
    }
}

