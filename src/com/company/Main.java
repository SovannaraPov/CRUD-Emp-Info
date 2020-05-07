package com.company;

import java.util.*;

public class Main {

    //validate inputOption
    private static int inputOption() {
        Scanner input = new Scanner(System.in);
        String str = null;
        int number = 0;

        while (true) {
            try {
                System.out.print("=> Choose option(1-4) : ");
                str = input.next();
                number = Integer.parseInt(str);
                if (number > 0 && number < 5) {
                    return number;
                } else {
                    System.out.println("Invalid Input");
                    continue;
                }
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                str = "" + number;
                continue;
            }
        }
    }

    //validate inputId
    private static int inputId(List<StaffMember> list_member) {
        Scanner input = new Scanner(System.in);
        String str = null;
        int number = 0;

        while (true) {
            try {
                repeat:
                {
                    System.out.print("=> Enter Staff Member's ID : ");
                    str = input.next();
                    number = Integer.parseInt(str);

                    for (StaffMember member : list_member) {
                        if (member.getId() == number) {
                            System.out.println("This ID already exist!");
                            break repeat;
                        } else if (number > 0 && number <= 3) {
                            System.out.println("This ID already exist!");
                            break repeat;
                        } else if (number <= 0) {
                            System.out.println("Invalid Input");
                            break repeat;
                        } else{
                            return number;
                        }
                    }
                }
                } catch(Exception ex){
                    System.out.println("Invalid Input");
                    str = "" + number;
                    continue;
                }
        }
    }

    //validate input HoursWorked, Rate, Salary, Bonus
    private static int inputHoursWorked() {
        Scanner input = new Scanner(System.in);
        String str = null;
        double number = 0;

        while (true) {
            try {
                str = input.next();
                number = Double.parseDouble(str);
                return (int) number;
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                System.out.print("=> Enter Hours Worked : ");
                str = "" + number;
                continue;
            }
        }
    }
    private static int inputRate() {
        Scanner input = new Scanner(System.in);
        String str = null;
        double number = 0;

        while (true) {
            try {
                str = input.next();
                number = Double.parseDouble(str);
                return (int) number;
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                System.out.print("=> Enter Rate : ");
                str = "" + number;
                continue;
            }
        }
    }
    private static int inputSalary() {
        Scanner input = new Scanner(System.in);
        String str = null;
        double number = 0;

        while (true) {
            try {
                str = input.next();
                number = Double.parseDouble(str);
                return (int) number;
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                System.out.print("=> Enter Salary : ");
                str = "" + number;
                continue;
            }
        }
    }
    private static int inputBonus() {
        Scanner input = new Scanner(System.in);
        String str = null;
        double number = 0;

        while (true) {
            try {
                str = input.next();
                number = Double.parseDouble(str);
                return (int) number;
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                System.out.print("=> Enter Bonus : ");
                str = "" + number;
                continue;
            }
        }
    }

    //addEmployee()
    private static void addEmployee(List<StaffMember> list_member) {
        Volunteer volunteer = new Volunteer();
        HourlyEmployee hourlyEmp = new HourlyEmployee();
        SalariedEmployee salariedEmp = new SalariedEmployee();

        Scanner input = new Scanner(System.in);
        int option = 0;
        System.out.println("----------------------------------------");
        System.out.println("1) Volunteer");
        System.out.println("2) Hourly Employee");
        System.out.println("3) Salaried Employee");
        System.out.println("4) Back");
        option = inputOption();

        switch(option) {
            case 1:
                System.out.print("=========== INSERT INFO =============== \n");
                volunteer.setId(inputId(list_member));
                System.out.print("=> Enter Staff Member's Name : ");
                volunteer.setName(input.nextLine().toUpperCase());
                System.out.print("=> Enter Staff Member's Address : ");
                volunteer.setAddress(input.nextLine());
                list_member.add(volunteer);
                break;
            case 2:
                System.out.print("=========== INSERT INFO =============== \n");
                hourlyEmp.setId(inputId(list_member));
                System.out.print("=> Enter Staff Member's Name : ");
                hourlyEmp.setName(input.nextLine().toUpperCase());
                System.out.print("=> Enter Staff Member's Address : ");
                hourlyEmp.setAddress(input.nextLine());
                System.out.print("=> Enter Hours Worked : ");
                hourlyEmp.setHoursWorked(inputHoursWorked());
                System.out.print("=> Enter Rate : ");
                hourlyEmp.setRate(inputRate());
                list_member.add(hourlyEmp);
                break;
            case 3:
                System.out.print("=========== INSERT INFO =============== \n");
                salariedEmp.setId(inputId(list_member));
                System.out.print("=> Enter Staff Member's Name : ");
                salariedEmp.setName(input.nextLine().toUpperCase());
                System.out.print("=> Enter Staff Member's Address : ");
                salariedEmp.setAddress(input.nextLine());
                System.out.print("=> Enter Salary : ");
                salariedEmp.setSalary(inputSalary());
                System.out.print("=> Enter Bonus : ");
                salariedEmp.setBonus(inputBonus());
                list_member.add(salariedEmp);
                break;
            case 4:
                break;
        }
    }

    private static void removeEmployee(List<StaffMember> list_member) {
        List<StaffMember> toRemove = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("=========== REMOVE EMPLOYEE =============== \n");
        System.out.print("Enter Employee ID To Remove : ");
        int removeId = input.nextInt();

        //Remove not working yet
        for (StaffMember member: list_member) {
            if (removeId == member.getId()) {
                toRemove.add(member);
            }
        }
        list_member.removeAll(toRemove);
        System.out.println("Removed Successfully.");

    }


    private static void editEmployee(List<StaffMember> list_member) {
        Scanner input = new Scanner(System.in);
        System.out.print("=========== EDIT INFO =============== \n");
        System.out.print("=> Enter Employee To Update : ");
        int updateId = input.nextInt();
        for (StaffMember member: list_member) {
            if (member.getId() == updateId) {
                if(member instanceof Volunteer) {
                    System.out.println("ID : " + member.getId());
                    System.out.println("Name : " + member.getName());
                    System.out.println("Address : " + member.getAddress());
                    input.nextLine();
                    System.out.print("=> Enter Staff Member's Name : ");
                    member.setName(input.nextLine().toUpperCase());
                    System.out.print("=> Enter Staff Member's Address : ");
                    member.setAddress(input.nextLine());
                }else if(member instanceof SalariedEmployee) {
                    System.out.println("ID : " + member.getId());
                    System.out.println("Name : " + member.getName());
                    System.out.println("Address : " + member.getAddress());
                    System.out.println("Salary : " + ((SalariedEmployee) member).getSalary());
                    System.out.println("Bonus : " + ((SalariedEmployee) member).getBonus());
                    input.nextLine();
                    System.out.print("=> Enter Staff Member's Name : ");
                    member.setName(input.nextLine().toUpperCase());
                    System.out.print("=> Enter Staff Member's Address : ");
                    member.setAddress(input.nextLine());
                    System.out.print("=> Enter Salary : ");
                    ((SalariedEmployee) member).setSalary(input.nextDouble());
                    System.out.print("=> Enter Bonus : ");
                    ((SalariedEmployee) member).setBonus(input.nextDouble());
                }else if(member instanceof HourlyEmployee) {
                    System.out.println("ID : " + member.getId());
                    System.out.println("Name : " + member.getName());
                    System.out.println("Address : " + member.getAddress());
                    System.out.println("HoursWorked : " + ((HourlyEmployee) member).getHoursWorked());
                    System.out.println("Rate : " + ((HourlyEmployee) member).getRate());
                    input.nextLine();
                    System.out.print("=> Enter Staff Member's Name : ");
                    member.setName(input.nextLine().toUpperCase());
                    System.out.print("=> Enter Staff Member's Address : ");
                    member.setAddress(input.nextLine());
                    System.out.print("=> Enter Hours Worked : ");
                    ((HourlyEmployee) member).setHoursWorked(input.nextInt());
                    System.out.print("=> Enter Rate : ");
                    ((HourlyEmployee) member).setRate(input.nextDouble());
                }
            }
        }

    }

    public static void main(String[] args) {
        List<StaffMember> list_member = new ArrayList<>();

        Volunteer volunteer = new Volunteer(1, "Seakmeng".toUpperCase(), "Phnom Penh");
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "Tyty".toUpperCase(), "Phnom Penh", 100, 20);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(3, "Chay".toUpperCase(), "Kompong cham", 8, 5);

        list_member.add(volunteer);
        list_member.add(salariedEmployee);
        list_member.add(hourlyEmployee);

        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            Collections.sort(list_member, new Comparator<StaffMember>(){
                public int compare(StaffMember o1, StaffMember o2)
                {
                    return o1.getName().compareTo(o2.getName());
                }
            });

            for (StaffMember member: list_member)
            {
                System.out.println(member.toString());
            }

            System.out.println("----------------------------------------");
            System.out.println("1) Add Employee");
            System.out.println("2) Edit Employee");
            System.out.println("3) Remove Employee");
            System.out.println("4) Exit");
            option = inputOption();

            switch(option) {
                case 1:
                    addEmployee(list_member);
                    continue;
                case 2:
                    editEmployee(list_member);
                    continue;
                case 3:
                    removeEmployee(list_member);
                    continue;
                case 4:
                    System.out.print("Bye Bye 😊");
                    System.exit(0);
            }

        } while(true);



    }

}
