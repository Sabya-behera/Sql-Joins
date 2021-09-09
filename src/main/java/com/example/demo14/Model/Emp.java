package com.example.demo14.Model;


import javax.persistence.*;

@Entity
@Table(name = "Emp")
public class Emp {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "sal")
    private double sal;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private Dept dept;

    public Emp() {
    }

    public Emp(long id, String name, double sal, Dept dept) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", Dept=" + dept +
                '}';
    }
}