package org.example;

public class Company {
   HRDept dept;
    public Company(HRDept dept){
      this.dept = dept;
    }
    public void setDept(HRDept dept){
        this.dept = dept;
        System.err.println("No Client No Work");

    }
    public void companyWork(){
        if(dept == null){
            System.err.println("No Client No Work");
        }
        else{
            dept.work();
        }
    }

}
