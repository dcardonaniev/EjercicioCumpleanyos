package me.davidlake.cumpleanyos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class BirthdayController {
    @GetMapping(path = "/{day}/{month}/{year}")
    public String calcularEdad(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period betweenPeriod = Period.between(birthDate, currentDate);

        return String.format("Tienes %d años.", betweenPeriod.getYears());
    }
}
