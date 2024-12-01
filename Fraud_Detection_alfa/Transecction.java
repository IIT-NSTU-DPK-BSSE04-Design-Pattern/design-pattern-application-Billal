class Transaction {
    private double amount;
    private String location;
    private String merchant;
    private int attempts;

    public Transaction(double amount, String location, String merchant, int attempts) {
        this.amount = amount;
        this.location = location;
        this.merchant = merchant;
        this.attempts = attempts;
    }

    public double getAmount() {
        return amount;
    }

    public String getLocation() {
        return location;
    }

    public String getMerchant() {
        return merchant;
    }

    public int getAttempts() {
        return attempts;
    }
}
