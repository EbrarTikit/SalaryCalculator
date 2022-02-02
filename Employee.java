public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        if(this.salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    int bonus() {
        int result =0;
        if(this.workHours >= 40) {
            for(int i =0;i<this.workHours;i++) {
                result +=30;
                //result = (workhours - 40)*30
            }
        }
        return result;

    }

    int raiseSalary() {
        if(2021 - this.hireYear < 10) {
            return (int) (this.salary*0.05);
        } else if(2021 - this.hireYear > 9  && 2021 - this.hireYear < 20) {
            return (int) (this.salary*0.1);
        } else {
            return (int) (this.salary*0.15);
        }
    }

    public String toString() {
        return "Name \t:" + this.name + "\n" +
                "Salary \t:" + this.salary + "\n" +
                "Work Hours \t:" + this.workHours + "\n" +
                "Hire Year \t:" + this.hireYear + "\n" +
                "Tax \t:" + tax() + "\n" +
                "Bonus \t:" + bonus() + "\n" +
                "Raise Salary \t:" + raiseSalary() + "\n" +
                "Salary with taxs and bonus \t:" + (this.salary - tax() + bonus()) + "\n" +
                "Total Salary \t:" + (this.salary + raiseSalary()) + "\n" ;
    }
}
