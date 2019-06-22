package com.fherdelpino.musicnotes;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class NoteTest {

    Note Ab, A, As, B, Bb, Cs, Fs;

    @Before
    public void setUp() {
        Ab = new Note(NoteLetter.A, NoteModifier.FLAT);
        A = new Note(NoteLetter.A);
        As = new Note(NoteLetter.A, NoteModifier.SHARP);
        Bb = new Note(NoteLetter.B, NoteModifier.FLAT);
        B = new Note(NoteLetter.B);
        Cs = new Note(NoteLetter.C, NoteModifier.SHARP);
        Fs = new Note(NoteLetter.F, NoteModifier.SHARP);
    }

    @Test(expected = InvalidNoteException.class)
    public void invalidNote_BSharp_throwsInvalidNoteException() {
        new Note(NoteLetter.B, NoteModifier.SHARP);
    }

    @Test(expected = InvalidNoteException.class)
    public void invalidNote_Fflat_throwsInvalidNoteException() {
        new Note(NoteLetter.F, NoteModifier.FLAT);
    }

    @Test
    public void toString_CSharp() {
        Note Cs = new Note(NoteLetter.C, NoteModifier.SHARP);
        assertEquals("C#", Cs.toString());
    }

    @Test
    public void note_compareTo_AvsB() {
        assertTrue(A.compareTo(B) < 0);
    }

    @Test
    public void note_compareTo_FsvsBb() {
        assertTrue(Fs.compareTo(Bb) > 0);
    }

    @Test
    public void note_equals_AtoA() {
        Note A2 = new Note(NoteLetter.A);
        assertEquals(A, A2);
    }

    @Test
    public void note_notEquals_AtoAb() {
        assertNotEquals(A, Ab);
    }

    @Test
    public void note_notEquals_AsToAb() {
        assertNotEquals(As, Ab);
    }

    @Test
    public void note_sort() {
        List<Note> scale = new ArrayList<>();
        scale.add(Cs);
        scale.add(Fs);
        scale.add(A);

        Collections.sort(scale);
        assertEquals(new Note(NoteLetter.A), scale.get(0));
    }
}
