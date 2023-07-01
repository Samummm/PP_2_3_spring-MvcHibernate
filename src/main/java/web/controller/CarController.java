package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class CarController {

	private static List<Car> carsList;
	@Autowired
	public CarController(List<Car> cars) {
		carsList = cars;
	}

	@GetMapping(value = "/cars")
	public static String printCars(@RequestParam(value = "count", required = false) Integer param, ModelMap model) {
		Optional <Integer> value = Optional.ofNullable(param);

		if (value.isPresent()) {
				model.addAttribute("carsList", carsList.subList(0, value.get()));
		} else {
			model.addAttribute("carsList", carsList);
		}
		return "cars";
	}
}