package PeeTest;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Vaccine {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Birthdate (yyyy-mm-dd) :");
        String dateString = s.nextLine();
        LocalDate date = null;
        LocalDate startDate = LocalDate.parse("2021-06-01");
        LocalDate endDate = LocalDate.parse("2021-08-31");
        try {
            date = LocalDate.parse(dateString);
        } catch (Exception e) {
            System.out.println("Pls check input date");
            main(args);
        }
        VaccineResponse response = new VaccineResponse();
        Period periodStartDate = Period.between(date, startDate);
        Period periodEndDate = Period.between(date, endDate);
        System.out.println("periodStartDate = " + periodStartDate.toString());
        System.out.println("periodEndDate = " + periodEndDate.toString());
        System.out.println("periodStartDate.toTotalMonths() = " + periodStartDate.toTotalMonths());
        System.out.println("periodEndDate.toTotalMonths() = " + periodEndDate.toTotalMonths());
        Period p2Y = Period.parse("P2Y");

//         if (periodStartDate.getYears() == 2 && periodStartDate.getMonths() == 0 && periodStartDate.getDays()==0){
        if (periodStartDate.equals(p2Y)) {
            response.setEligibleFlag(true);
            response.setStartDate(startDate.toString());
            response.setEndDate(startDate.toString());
        } else if (periodStartDate.getYears() < 2 && periodStartDate.toTotalMonths() >= 6) {
            System.out.println("-------------------------1-------------------------");
            response.setEligibleFlag(true);
            response.setStartDate(startDate.toString());
            LocalDate resEndDate = date.plusYears(2);
            response.setEndDate(resEndDate.isBefore(endDate) ? resEndDate.toString() : endDate.toString());
        } else if (periodEndDate.getYears() < 2 && periodEndDate.toTotalMonths() >= 6) {
            System.out.println("-------------------------2-------------------------");
            response.setEligibleFlag(true);
            response.setStartDate(date.plusMonths(6).toString());
            response.setEndDate(endDate.toString());
        } else if (periodStartDate.getYears() >= 65) {
            System.out.println("-------------------------3-------------------------");

            response.setEligibleFlag(true);
            response.setStartDate(startDate.toString());
            response.setStartDate(endDate.toString());
        } else if (periodEndDate.getYears() >= 65) {
            System.out.println("-------------------------4-------------------------");

            response.setEligibleFlag(true);
            response.setStartDate(date.plusYears(65).toString());
            response.setEndDate(endDate.toString());
        }
        System.out.println(response);
        main(args);
    }
}
