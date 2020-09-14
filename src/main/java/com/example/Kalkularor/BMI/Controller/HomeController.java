package com.example.Kalkularor.BMI.Controller;

import com.example.Kalkularor.BMI.Model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(ModelMap map) {
        map.put("powitanie", "Kalkulator BMI");
        map.put("opis", "Kalkulator BMI (Body Mass Index) daje każdemu możliwość szybkiego i wygodego obliczenia własnego wskaźnika masy ciała. BMI obliczamy dzieląc masę ciała (w kilogramach) przez wzrost do kwadratu (w metrach). Wskaźnik ten wykorzystywany jest przede wszystkim do oceny ryzyka pojawienia się groźnych chorób: miażdżycy, choroby niedokrwiennej serca, udaru mózgu, czy nawet nowotworów. Większość tych chorób jest związana z otyłością i dlatego kalkulator BMI to tak przydatne narzędzie.");
        map.put("wzrost", "Podaj swój wzrost w centymetrach");
        map.put("waga", "Podaj swoją wagę w kilogramach");
        return "home";
    }

    @GetMapping("/result")
    public String getResults(@RequestParam(value = "weight") Integer weight, @RequestParam(value = "height") Integer height, ModelMap map) {
        Calculator calculator = new Calculator();
        map.put("wynik", calculator.calculateBmi(weight,height));
        map.put("opis", calculator.getBmiDescription(calculator.calculateBmi(weight, height)));
//        map.put("weight", weight);
//        map.put("height", height);
        return "result";
    }

}
