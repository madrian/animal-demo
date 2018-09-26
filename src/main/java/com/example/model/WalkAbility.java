package com.example.model;

import com.example.util.AnimalHelper;

public interface WalkAbility {

    default String walk() {
        return AnimalHelper.executeAbility(AbilityMessage.WALK);
    }
}
