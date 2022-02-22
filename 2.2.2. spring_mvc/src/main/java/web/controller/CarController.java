package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Dao.carDoaImpl;
import web.sevies.serviesCarImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final serviesCarImpl carServes;

   @Autowired
    public CarController(serviesCarImpl carServes) {
        this.carServes =carServes;
    }

    @GetMapping()
    public String getAllCar(Model model){
       model.addAttribute("massage",carServes.getAllCar());
       return "/getAllCar";
    }

    @GetMapping("/")
    public String getCar(@RequestParam(value = "count",required = false)int count, Model model){
       model.addAttribute("count",carServes.getCar(count));
       return "/getCar";
    }
}
