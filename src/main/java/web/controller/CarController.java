package web.controller;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

	@GetMapping(value = "/cars")
	public static String printCars(@RequestParam(value = "count", required = false) Integer param, ModelMap model) {
		Optional <Integer> value = Optional.ofNullable(param);
		if (value.isPresent()) {
			if (value.get() < 5) {
				model.addAttribute("carsList", new CarServiceImpl().getCars().subList(0, value.get()));
			}
		} else {
			model.addAttribute("carsList", new CarServiceImpl().getCars());
		}
		return "cars";
	}
}