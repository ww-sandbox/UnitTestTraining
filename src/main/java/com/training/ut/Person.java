package com.training.ut;

import org.testng.annotations.Test;

public class Person {
    public String describePerson(String sex, int age){
        String description = "To jest ";
        if(age <= 0 || (!sex.equalsIgnoreCase("k") && !sex.equalsIgnoreCase("m"))){
            description = "Niepoprawne dane.";
            if (age<=0){
                description += "\nWiek powinien być większy od zera.";
            }
            if(!sex.equalsIgnoreCase("k") && !sex.equalsIgnoreCase("m")){
                description += "\nPłeć powinna mieć wartość k lub m";
            }
            return description;

        } else {
            if(sex.equalsIgnoreCase("k")){
                if(age < 11){
                     description += "dziewczynka";
                }else if (age > 19){
                    description += "kobieta";
                } else{
                    description += "nastolatka";
                }
            } else {
                if(age < 11){
                    description += "chłopiec";
                }else if (age > 19){
                    description += "mężczyzna";
                } else{
                    description += "nastolatek";
                }
            }
            return description + " w wieku " + age + " lat";
        }
    }
}
