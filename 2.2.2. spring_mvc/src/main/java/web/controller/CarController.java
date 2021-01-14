package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Ivan Sapronov
 */
@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(HttpServletRequest request, ModelMap model) {

        List<Car> cars = new ArrayList<>();

        String countString = request.getParameter("count");
        int count = 0;
        if(countString != null) count = Integer.parseInt(countString);
        if(count >= 5 || countString == null) count = 5;
        if(count < 0) count = 0;
        for (int i = 0; i < count; i++) {
            cars.add(new Car("brand" + i, "type" + i, i * 100));
        }
        model.addAttribute("cars", cars);
        return "cars";
    }

}
