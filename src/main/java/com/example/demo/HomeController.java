package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/")
    public String index(Model model){

        //we can populate the arraylist from the customerRepository
        //Since the repository returns an iterable (a more generic class) we need
        //to cast it to an arrayList of type customer: (ArrayList<Customer>)

        //the % symbol is an optional wildcard for 0 or more characters
        String lastName = "Smith%";
        ArrayList<Customer> results =(ArrayList<Customer>)
                customerRepository.findAllByLastNameContainingIgnoreCase(lastName);

        // The state could be selected from a user form and submitted back to the controller
        String state = "CA";
        long total = customerRepository.countByState(state);

        //display our results on the index page...
        model.addAttribute("state",state);
        model.addAttribute("total",total);
        model.addAttribute("results", results);
        return "index";
    }
}
