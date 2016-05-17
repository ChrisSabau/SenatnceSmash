package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by csabau on 5/17/2016.
 */
public class SmashTests {
    @Test
    public void testValidateSmash() {
        assertEquals("Hello beautiful world", Smash.smashSentance(new String[] { "Hello", "beautiful","world" }));
    }

    @Test
    public void testValidateSmashEmpty() {
        assertEquals("", Smash.smashSentance(new String[] {}));
    }

    @Test
    public void testValidateSmashNull() {
        assertNull(Smash.smashSentance(null));
    }

    @Test
    public void testValidateSmashOneWord() {
        assertEquals("Hello", Smash.smashSentance(new String[] {"Hello"}));
    }
}
