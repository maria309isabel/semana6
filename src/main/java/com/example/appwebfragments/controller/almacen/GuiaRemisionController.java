package com.example.appwebfragments.controller.almacen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/almacen/guiaRemision")

public class GuiaRemisionController {
    @GetMapping("")
    public String index(){
        return "almacen/guiaRemision";
    }
}
