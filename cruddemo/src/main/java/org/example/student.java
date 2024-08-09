package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String fname;
    @Column(name = "last_name")
    private String lname ;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentdetails_id")
    private studentdetails studentdetails;

    public org.example.studentdetails getStudentdetails() {
        return studentdetails;
    }

    public void setStudentdetails(org.example.studentdetails studentdetails) {
        this.studentdetails = studentdetails;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
