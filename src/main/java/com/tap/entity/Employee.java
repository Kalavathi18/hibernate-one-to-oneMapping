package com.tap.entity;



import jakarta.persistence.*;

@Entity
@Table(name="employee1")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToOne(cascade=CascadeType.ALL) // Cascade ensures EmployeeDetails gets saved
    @JoinColumn(name="empdetails_id")  // This creates a foreign key in Employee table
    private EmployeeDetails empdetails;

    public Employee(String name, EmployeeDetails empdetails) {
        this.name = name;
        this.empdetails = empdetails;
    }

    public Employee() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDetails getEmpdetails() {
        return empdetails;
    }

    public void setEmpdetails(EmployeeDetails empdetails) {
        this.empdetails = empdetails;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", empdetails=" + empdetails + "]";
    }
}


