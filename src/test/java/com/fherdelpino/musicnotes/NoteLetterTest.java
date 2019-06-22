package com.fherdelpino.musicnotes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NoteLetterTest {

    @Test
    public void noteLetter_testA_toString() {
        assertEquals("A", NoteLetter.A.toString());
    }

    @Test
    public void noteLetter_testB_name() {
        assertEquals("B", NoteLetter.B.name());
    }

    @Test
    public void noteLetter_testC_ordinal() {
        assertEquals(2, NoteLetter.C.ordinal());
    }

    @Test
    public void noteLetter_sort() {
        List<NoteLetter> scale = new ArrayList<>();
        scale.add(NoteLetter.G);
        scale.add(NoteLetter.E);
        scale.add(NoteLetter.A);
        scale.add(NoteLetter.C);
        scale.add(NoteLetter.F);
        scale.add(NoteLetter.B);
        scale.add(NoteLetter.D);

        Collections.sort(scale);

        List<NoteLetter> sortedList = new ArrayList<>();
        sortedList.add(NoteLetter.A);
        sortedList.add(NoteLetter.B);
        sortedList.add(NoteLetter.C);
        sortedList.add(NoteLetter.D);
        sortedList.add(NoteLetter.E);
        sortedList.add(NoteLetter.F);
        sortedList.add(NoteLetter.G);

        assertEquals(sortedList, scale);

    }

}
