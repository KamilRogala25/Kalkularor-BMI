package Model;

abstract class Calculator {

    public static double roundTwoPlaces(double toRound) {
        toRound = Math.round(toRound * 100.0) / 100.0;
        return toRound;

    }

    public static double calculateBmi(double weight, double height) {
        if (height > 3.0) {
            height /= 100;
        }
        double result = weight / Math.pow(height, 2);
        return Calculator.roundTwoPlaces(result);
    }

    public static String getBmiDescription(double bmi) {
        if (bmi <= 16.0) {
            return "Wygłodzenie";
        } else if (bmi >= 16.0 && bmi <= 16.99) {
            return "Wychudzenie";
        } else if (bmi >= 17.0 && bmi <= 18.49) {
            return "Niedowaga";
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            return "Waga prawidłowa";
        } else if (bmi >= 25.0 && bmi <= 29.99) {
            return "Nadwaga";
        } else if (bmi >= 30.0 && bmi <= 34.99) {
            return "I stopień otyłości";
        } else if (bmi >= 35.0 && bmi <= 39.99) {
            return "II stopień otyłości";
        } else if (bmi >= 40.0) {
            return "Skrajna otyłość";
        }
        return "";
    }

}
