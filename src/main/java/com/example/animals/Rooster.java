package com.example.animals;

import com.example.model.Animal;
import com.example.model.SingAbility;
import com.example.model.WalkAbility;

import java.util.ResourceBundle;

import static com.example.util.AnimalHelper.log;

/**
 * A <code>Rooster</code> is a chicken.
 *
 * <p>This implementation however wraps a <code>Chicken</code> but does not
 * inherit it directly.</p>
 *
 * <p>A rooster can also sing in different {@link java.util.Locale}s.
 * See the resource bundle <code>songs_xx_xx.properties</code> for the
 * different languages.</p>
 *
 */
public class Rooster implements Animal, WalkAbility, SingAbility {
    private Chicken chicken;
    ResourceBundle bundle;

    public Rooster() {
        //a rooster is just a chicken inside!
        chicken = new Chicken();
        bundle = ResourceBundle.getBundle("songs");
    }

    @Override
    public String walk() {
        return chicken.walk();
    }

    /**
     * A rooster is just a chicken but sings differently.
     *
     * @return rooster song
     */
    @Override
    public String sing() {
        String message = bundle.getString("rooster.song");
        log(message);
        return message;
    }
}
