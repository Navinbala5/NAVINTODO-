package com.example.elam.todo1sa;

/**
 * Created by elam on 16-07-2017.
 */


import com.example.elam.todo1sa.beans.beans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Locale;



public class DateComparator implements Comparator<beans> {

    private DateFormat f = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    @Override
    public int compare(beans o1, beans o2) {
        String leftdate = o1.getDate();
        String rightdate = o2.getDate();

        try{
            return f.parse(leftdate).compareTo(f.parse(rightdate));

        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }

    }
}