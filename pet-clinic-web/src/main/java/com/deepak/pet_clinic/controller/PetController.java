package com.deepak.pet_clinic.controller;

import com.deepak.pet_clinic.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/pet")
public class PetController {
    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index(Model model){
        model.addAttribute("pets", petService.findAll());
        return "pet/index";
    }
}
