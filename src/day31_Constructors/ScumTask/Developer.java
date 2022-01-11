package day31_Constructors.ScumTask;

public class Developer {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;


    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesters(){
        System.out.println(name+" is unitTesters");
    }
    public void fixingBug(){
        System.out.println(name+" is fixingBug");
    }



}

/*

create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary
	          Add A constructor that can set all the fileds
	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()

 */