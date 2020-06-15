package storemanagement;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;
import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    private int totalEmployee;
    private ArrayList <Employee> employees = new ArrayList<>();
    ArrayList<FulltimeEmployee> fulltimeEmployees = new ArrayList<>();
    ArrayList<ParttimeEmployee> parttimeEmployees = new ArrayList<>();




    public EmployeeManagement() {
    }

    public EmployeeManagement(int totalEmployee, ArrayList<Employee> employees) {
        this.totalEmployee = this.employees.size();
        this.employees = employees;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

}
