package com.ltp.workbook7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Workbook7Controller {
    
    @GetMapping("/")
    public String getName(Model model) {
        model.addAttribute("name", "Rayan");
        return "name";
    }

}
