package com.livingbeings.livingbeings;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livingbeing.Animal;
import com.livingbeing.creator.MainTestClass;

@RestController
public class LivingBeingController {

	@RequestMapping("/livingbeings")
	public List<Animal> getLivingBeingDetails() {
		List<Animal> result =MainTestClass.process();
		return   result;
	}
}
