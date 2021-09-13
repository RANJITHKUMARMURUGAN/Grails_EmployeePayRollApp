package com.bridgelabz

class Employee {
    static belongsTo = [company: Company];
    String emp_Name;
    Integer emp_Age;
    Integer salary;
    String city;

    static constraints = {
        emp_Name size: 4..40,blank: false, unique: true
        emp_Age min: 20,max: 60, blank: false
        salary min: 20000,max: 100000, blank: false;  //size: 4..40,blank: false
        city size: 4..40, blank: false
    }
    String toString(){
        emp_Name;
    }
}
