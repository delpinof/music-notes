package com.fherdelpino.musicnotes;

import org.apache.commons.lang3.StringUtils;

public class Note implements Comparable<Note> {

    private NoteLetter noteLetter;
    private NoteModifier noteModifier;

    public Note(NoteLetter nl) {
        noteLetter = nl;
    }

    public Note(NoteLetter nl, NoteModifier nm) {

        if (!NoteValidator.validate(nl, nm))
            throw new InvalidNoteException(nl, nm);

        noteLetter = nl;
        noteModifier = nm;
    }

    @Override
    public int compareTo(Note o) {
        int ordinal = this.noteLetter.ordinal() - o.noteLetter.ordinal();
        if (ordinal != 0)
            return ordinal;
        ordinal = this.noteModifier.ordinal() - o.noteModifier.ordinal();
        return ordinal;
    }

    @Override
    public String toString() {
        String modifier = noteModifier == null ? StringUtils.EMPTY : noteModifier.toString();
        return noteLetter.toString().concat(modifier);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Note))
            return false;
        Note n = (Note) obj;
        if (this.noteLetter.equals(n.noteLetter)) {
            if (this.noteModifier == null && n.noteModifier == null)
                return true;
            if (this.noteModifier == null)
                return false;
            return this.noteModifier.equals(n.noteModifier);
        } else {
            return false;
        }
    }

}
