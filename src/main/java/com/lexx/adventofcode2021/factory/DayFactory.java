package com.lexx.adventofcode2021.factory;

import com.lexx.adventofcode2021.objects.Day;
import com.lexx.adventofcode2021.objects.days.Day01;

public class DayFactory {

    public Day getDay(int dayNumber) {

        if (dayNumber != 0) {
            if (dayNumber == 1) {
                return new Day01();
            }
        }

        return null;
    }

}
