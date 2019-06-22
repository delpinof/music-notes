package com.fherdelpino.musicnotes;

public enum NoteModifier {
    FLAT, SHARP;

    public String toString() {
        return name().equals("SHARP") ? "#" : "b";
    }
}
