package ru.udodov.app;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class QuadraticSolution {
    private String formula;
    private double discriminant;
    private Double x1;
    private Double x2;

    public QuadraticSolution(String formula, double discriminant, Double x1, Double x2) {
        this.formula = formula;
        this.discriminant = discriminant;
        this.x1 = x1;
        this.x2 = x2;
    }
}

