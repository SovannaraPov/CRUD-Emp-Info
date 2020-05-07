package com.company;

public class SalariedEmployee extends StaffMember{
    private double salary;
    private double bonus;

    public SalariedEmployee() {

    }

    public SalariedEmployee(int id, String name, String address, double salary, double bonus) {
        super(id, name, address);
        this.setSalary(salary);
        this.setBonus(bonus);
    }

    @Override
    public double pay() {
        if (getSalary() < 0 || getBonus() < 0) {
            return 0;
        } else {
            return getSalary() + getBonus();
        }
    }

    @Override
    public String toString() {
        return "---------------------------------------- \n" +
                "ID : " + getId() + "\n" + "Name : " + getName() +
                "\n" + "Address : " + getAddress() + "\n" + "Salary : " +
                getSalary() + "\n" + "Bonus : " + getBonus() + "\n" +"Payment : " + pay() + "\n";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
