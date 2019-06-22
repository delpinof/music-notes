package com.fherdelpino.musicnotes;

public class InvalidNoteException extends RuntimeException {

    public static final String MESSAGE = "Invalid note: ";

    public InvalidNoteException(NoteLetter nl, NoteModifier nm) {
        super(MESSAGE.concat(nl.toString().concat(nm.toString())));
    }
}
