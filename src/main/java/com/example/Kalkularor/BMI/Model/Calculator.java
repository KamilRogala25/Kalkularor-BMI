package com.example.Kalkularor.BMI.Model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Calculator {

    public static double roundTwoPlaces(double toRound) {
        toRound = Math.round(toRound * 100.0) / 100.0;
        return toRound;

    }

    public double calculateBmi(Integer weight, Integer height) {
        double height1 = (double) height/100;
        double result = weight / Math.pow(height1, 2);
        return Calculator.roundTwoPlaces(result);
    }

    public String getBmiDescription(double bmi) {
        if (bmi <= 16.0) {
            return "wygłodzenie";
        } else if (bmi >= 16.0 && bmi <= 16.99) {
            return "wychudzenie";
        } else if (bmi >= 17.0 && bmi <= 18.49) {
            return "wiedowagę";
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            return "wagę prawidłową";
        } else if (bmi >= 25.0 && bmi <= 29.99) {
            return "nadwagę";
        } else if (bmi >= 30.0 && bmi <= 34.99) {
            return "I stopień otyłości";
        } else if (bmi >= 35.0 && bmi <= 39.99) {
            return "II stopień otyłości";
        } else if (bmi >= 40.0) {
            return "skrajna otyłość";
        }
        return "";
    }

}
