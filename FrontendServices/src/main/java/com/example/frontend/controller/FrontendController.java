package com.example.frontend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class FrontendController {

    private final String GATEWAY_BASE_URL = "http://localhost:8083"; // Gateway port

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        try {
            // Get User from Gateway
        	String user=GATEWAY_BASE_URL + "/USERSERVICE/get/1";
          model.addAttribute("user",user ) ;

            // Get Product from Gateway
           String product= GATEWAY_BASE_URL + "/PRODUCTSERVICE/get/1";
           model.addAttribute("product", product);
            // Get Order from Gateway
           String order= GATEWAY_BASE_URL + "/ORDERSERVICE/order/1";
           model.addAttribute("order", order);
           System.out.println(user);
           System.out.println(product);
           System.out.println(order);

            // Link to Eureka dashboard
            model.addAttribute("eurekaUrl", "http://localhost:8761");

            return "home";

        } catch (Exception ex) {
            model.addAttribute("error", "Could not fetch data from API Gateway");
            return "error";
        }
    }
}

