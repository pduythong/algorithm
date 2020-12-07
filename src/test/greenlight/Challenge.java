package test.greenlight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Challenge {

    /*
     * Calculate Billing for each active user.
     */
    static TriFunction<LocalDate, Subscription, User, Double> calculateBillForUser = (monthStart, activeSubscription, user) -> {

        // get number days of billing month.
        int lengthOfMonth = monthStart.lengthOfMonth();

        // calculate the end date of the month.
        LocalDate monthEnd = monthStart.plusDays(lengthOfMonth);

        double dailyRate = (double) activeSubscription.monthlyPriceInDollars / lengthOfMonth;

        LocalDate subscriptionOn = user.activatedOn;
        LocalDate subscriptionOff = user.deactivatedOn;

        // if user active before the billing date. start calculation billing date at the first date of month
        if (user.activatedOn.isBefore(monthStart)) {
            subscriptionOn = monthStart;
        }

        // if user deactivate after the end of month calculate to the end of day of billing date.
        if (subscriptionOff == null || subscriptionOff.isAfter(monthEnd)) {
            subscriptionOff = monthEnd;

        }

        long usedDays = ChronoUnit.DAYS.between(subscriptionOn, subscriptionOff);

        double monthlyRate = dailyRate * usedDays;
        return monthlyRate;

    };

    public static void main(String[] args) {
        String month = "2019-01";
//        User[] users = new User[]{new User(1, "1", 1, LocalDate.of(2018, 11, 4), LocalDate.of(2019, 1, 10)),
//                new User(2, "2", 1, LocalDate.of(2018, 12, 4), null)};
//
//        User[] users = new User[]{new User(1, "1", 1, LocalDate.of(2018, 11, 4), null),
//                new User(2, "2", 1, LocalDate.of(2018, 12, 4), null),
//                new User(2, "2", 1, LocalDate.of(2019, 1, 10), null)};
//

        User[] users = new User[]{new User(1, "1", 1, LocalDate.of(2019, 1, 4),  LocalDate.of(2019, 1, 5)),
               };
        Subscription subscription = new Subscription(1, 1, 4);
        System.out.println(billFor(month, subscription, users));
    }

    public static double billFor(String month, Subscription activeSubscription, User[] users) {

        if (activeSubscription == null) return 0;

        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("yyyy-MM").parseDefaulting(ChronoField.DAY_OF_MONTH, 1).toFormatter();
        LocalDate monthStart = LocalDate.parse(month, formatter);
        double result = 0;

        for (User user : users) {
            result += calculateBillForUser.apply(monthStart, activeSubscription, user);
        }

        result = (int)((result * 100) + 0.5) /100.0;
        return result;

    }

    @FunctionalInterface
    public interface TriFunction<T, U, S, R> {

        /**
         * Applies this function to the given arguments.
         *
         * @param t the first function argument
         * @param u the second function argument
         * @param s the third function argument
         * @return the function result
         */
        R apply(T t, U u, S s);
    }


}
