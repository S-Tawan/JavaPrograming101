package PeeTest;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Vaccine {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Birthdate (yyyy-mm-dd) :");
        String dateString = s.nextLine();
        LocalDate birthDate = null;
        LocalDate startDate = LocalDate.parse("2021-06-01");
        LocalDate endDate = LocalDate.parse("2021-08-31");
        try {
            birthDate = LocalDate.parse(dateString);
        } catch (Exception e) {
            System.out.println("Pls check input date");
            main(args);
        }
        VaccineResponse response = new VaccineResponse();
        if (birthDate.isAfter(startDate.minusYears(2).minusDays(1)) && birthDate.isBefore(endDate.minusMonths(6).plusDays(1))) {
            LocalDate plusYears2 = birthDate.plusYears(2);
            LocalDate plusMonths6 = birthDate.plusMonths(6);
            response.setEligibleFlag(true);
            response.setStartDate(plusMonths6.isAfter(startDate) ? plusMonths6.toString() : startDate.toString());
            response.setEndDate(plusYears2.isBefore(endDate) ? plusYears2.toString() : endDate.toString());
        } else if (birthDate.isBefore(endDate.minusYears(65).plusDays(1))) {
            LocalDate plusYears65 = birthDate.plusYears(65);
            response.setEligibleFlag(true);
            response.setStartDate(startDate.isBefore(plusYears65) ? plusYears65.toString() : startDate.toString());
            response.setEndDate(endDate.toString());
        }
        System.out.println(response);
        main(args);
    }
}
