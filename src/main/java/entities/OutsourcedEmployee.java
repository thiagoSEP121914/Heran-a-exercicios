package entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee () {
        super();
    }

    public OutsourcedEmployee (String name, Integer hours, Double valuePerHour, Double additionalChange) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalChange;
    }
    @Override
   public  Double payment () {
        return super.payment() + additionalCharge * 1.1;
   }

}
