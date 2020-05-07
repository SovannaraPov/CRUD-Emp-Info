package com.company;

public class HourlyEmployee extends StaffMember {
    private int hoursWorked;
    private double rate;

    public HourlyEmployee() {

    }

    public HourlyEmployee(int id, String name, String address, int hoursWorked, double rate)
    {
        super(id, name, address);
        this.setHoursWorked(hoursWorked);
        this.setRate(rate);
    }

    @Override
    public double pay() {
        if (getHoursWorked() < 0 || getRate() < 0) {
            return 0;
        } else {
            return getHoursWorked() * getRate();
        }
    }

    @Override
    public String toString() {
        return "---------------------------------------- \n" +
                "ID : " + getId() + "\n" + "Name : " + getName() +
                "\n" + "Address : " + getAddress() + "\n" + "Hours Worked : " +
                getHoursWorked() + "\n" + "Rate : " + getRate() + "\n" +"Payment : " +
                pay() + "\n\n----------------------------------------";
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
