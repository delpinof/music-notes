package com.fherdelpino.musicnotes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NoteModifierTest {

    @Test
    public void testSharp() {
        assertEquals("#",NoteModifier.SHARP.toString());
    }

    @Test
    public void testFlat() {
        assertEquals("b",NoteModifier.FLAT.toString());
    }

    @Test
    public void testOrdinal() {
        assertTrue(NoteModifier.FLAT.ordinal() < NoteModifier.SHARP.ordinal());
    }
}
