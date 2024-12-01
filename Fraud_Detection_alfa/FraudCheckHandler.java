class FraudCheckH implements FraudCheck {
    private FraudCheck currentCheck;
    private FraudCheck nextCheck;

    public FraudCheckH(FraudCheck currentCheck, FraudCheck nextCheck) {
        this.currentCheck = currentCheck;
        this.nextCheck = nextCheck;
    }

    @Override
    public boolean check(Transaction transaction) {
        if (currentCheck.check(transaction)) {
            return nextCheck != null ? nextCheck.check(transaction) : true;
        }
        return false;
    }
}