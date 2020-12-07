package test.greenlight;

public class Subscription {
    int id;
    int customerId;
    int monthlyPriceInDollars;

    public Subscription() {
    }

    public Subscription(int id, int customerId, int monthlyPriceInDollars) {
        this.id = id;
        this.customerId = customerId;
        this.monthlyPriceInDollars = monthlyPriceInDollars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getMonthlyPriceInDollars() {
        return monthlyPriceInDollars;
    }

    public void setMonthlyPriceInDollars(int monthlyPriceInDollars) {
        this.monthlyPriceInDollars = monthlyPriceInDollars;
    }
}
