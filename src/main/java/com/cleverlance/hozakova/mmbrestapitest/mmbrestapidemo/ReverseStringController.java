package com.cleverlance.hozakova.mmbrestapitest.mmbrestapidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ReverseStringController {

    @GetMapping("/mmb-reverse-string-demo/{inputString}")
    public String getReverseString(@PathVariable(value="inputString") String inputStr){

        String reverse = "";

        for(int i = inputStr.length() - 1; i >= 0; i--)
        {
            Character character = inputStr.charAt(i);
            reverse = reverse + character.toString().replaceAll("[A-ZÁČĎÉĚÍŇÓŘŠŤŮÚÝŽ]",character.toString().toLowerCase()).
                    replaceAll("a|e|i|o|u",character.toString().toUpperCase());

        }

        return reverse.replaceAll("\\s+"," ");

    }


}
