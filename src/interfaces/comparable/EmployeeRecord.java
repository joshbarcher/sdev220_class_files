package interfaces.comparable;

import java.time.LocalDate;

public class EmployeeRecord {
    private int id;
    private String fName;
    private String lName;
    private LocalDate hireDate;

    public EmployeeRecord(int id, String fName,
                          String lName, LocalDate hireDate) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString()
    {
        return "#" + id + ", " + fName + " " + lName;
    }
}

