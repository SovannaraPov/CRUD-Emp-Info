package com.company;

public class Volunteer extends StaffMember {

    public Volunteer() {

    }

    public Volunteer(int id, String name, String address)
    {
        super(id, name, address);
    }

    @Override
    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return "---------------------------------------- \n" +
                "ID : " + getId() + "\n" + "Name : " + getName() +
                "\n" + "Address : " + getAddress() + "\n";
    }
}
