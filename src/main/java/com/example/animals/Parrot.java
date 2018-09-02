package com.example.animals;

import com.example.model.SingAbility;

/**
 * A <code>Parrot</code> inherits a <code>FlyingBird</code> but mimics
 * any singing friend.
 *
 */
public class Parrot extends FlyingBird {
    private SingAbility friend;

    /**
     * Creates a parrot without a singing friend.
     */
    public Parrot() { }

    /**
     * Creates a parrot with a singing friend.
     *
     * @param friend a friend that can sing.
     */
    public Parrot(SingAbility friend) {
        this.friend = friend;
    }

    @Override
    public String sing() {
        return friend == null ? super.sing() : friend.sing();
    }

}
