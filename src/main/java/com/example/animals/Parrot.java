package com.example.animals;

import com.example.model.ParrotType;
import com.example.model.SingAbility;

/**
 * A <code>Parrot</code> inherits a <code>FlyingBird</code> but mimics
 * any singing friend.
 *
 */
public class Parrot extends FlyingBird {
    private ParrotType type;
    private SingAbility friend;

    /**
     * @deprecated as of release v1.4, replaced by {@link #Parrot(SingAbility)}
     * @param type
     */
    @Deprecated
    public Parrot(ParrotType type) {
        this.type = type;
        song = type.getSong();
    }

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
