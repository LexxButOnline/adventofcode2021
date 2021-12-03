package com.lexx.adventofcode2021;

import com.lexx.adventofcode2021.factory.DayFactory;
import com.lexx.adventofcode2021.objects.Day;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class CodeRunner {

	public static void main(String[] args) {
		DayFactory dayFactory = new DayFactory();
		Day day = dayFactory.getDay(1);

		// day.doChallenge1();
		day.doChallenge2();
	}

}
