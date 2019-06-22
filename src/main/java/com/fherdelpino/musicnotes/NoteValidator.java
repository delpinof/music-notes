package com.fherdelpino.musicnotes;

public class NoteValidator {

    static final boolean validate(NoteLetter nl, NoteModifier nm) {
        if ((nl.equals(NoteLetter.B) || nl.equals(NoteLetter.E)) &&
                nm.equals(NoteModifier.SHARP))
            return false;

        if ((nl.equals(NoteLetter.C) || nl.equals(NoteLetter.F)) &&
                nm.equals(NoteModifier.FLAT))
            return false;

        return true;
    }
}
