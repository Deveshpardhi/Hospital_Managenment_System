public abstract class PatientDischargeProcess {
    // Template method
    public final void processDischarge() {
        generateBill();
        dischargeInstructions();
        updateRecords();
        sendNotification();
    }

    protected abstract void dischargeInstructions();

    private void generateBill() {
        System.out.println("Generating bill for discharge...");
    }

    private void updateRecords() {
        System.out.println("Updating patient records...");
    }

    private void sendNotification() {
        System.out.println("Sending discharge notification to patient and staff.");
    }
}