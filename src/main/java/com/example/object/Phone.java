package com.example.object;

import com.example.model.SingAbility;
import com.example.util.AnimalHelper;

public class Phone implements SingAbility {

    @Override
    public String sing() {
        String message = "Riiiiing, riiiiing.";
        AnimalHelper.log(message);
        return message;
    }
}
