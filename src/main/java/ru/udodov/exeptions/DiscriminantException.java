package ru.udodov.exeptions;

import lombok.Data;

@Data
public class DiscriminantException extends Exception {
    private String formula;
    private double discriminant;

    public DiscriminantException(String message, String formula, double discriminant) {
        super(message);
        this.formula = formula;
        this.discriminant = discriminant;
    }
}

