package smartHealthCareSystem;
import smartHealthCareSystem.*;
class AppointmentFeeCalculator extends Calculator {

    private double fee;

    public AppointmentFeeCalculator(double fee) {
        this.fee = fee;
    }
    @Override
    public double calculate() {
        return baseAmount + fee;
    }
}
