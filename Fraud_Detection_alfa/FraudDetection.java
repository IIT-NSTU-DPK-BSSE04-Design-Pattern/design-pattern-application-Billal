public class FraudDetection{
    private FraudCheck frstCheck;
    public FraudDetection() {
        this.frstCheck = new BasicCheck();
        FraudCheck secondCheck = new GeographicalAnomalyCheck();
        FraudCheck thirdCheck = new BlacklistedMerchantCheck();
        FraudCheck fourthCheck = new HighRiskTransactionCheck();
        frstCheck = new FraudCheckHandler(frstCheck, secondCheck);
        secondCheck = new FraudCheckHandler(secondCheck, thirdCheck);
        thirdCheck = new FraudCheckHandler(thirdCheck, fourthCheck);
    }
    public boolean processTransaction(Transaction transaction) {
        return frstCheck.check(transaction);
    }
}

