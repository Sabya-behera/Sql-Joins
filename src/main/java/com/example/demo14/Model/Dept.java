package com.example.demo14.Model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name ="Dept")
public class Dept {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "dname")
    private String dname;

    @Column(name = "Location")
    private String location;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dept")
    private List<Emp> emp;

    public Dept() {
    }

    public Dept(long id, String dname, String location, List<Emp> emp) {
        this.id = id;
        this.dname = dname;
        this.location = location;
        this.emp = emp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Emp> getEmp() {
        return emp;
    }

    public void setEmp(List<Emp> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                ", location='" + location + '\'' +
                ", Emp=" + emp +
                '}';
    }
}