package inter;

public interface payment {
    // we have to initialize the variable fully if we write some variable in java
    String currency = "Ruppes";

    void pay(double amount);
    void refund(double amount);
    boolean validatePayment();
}


