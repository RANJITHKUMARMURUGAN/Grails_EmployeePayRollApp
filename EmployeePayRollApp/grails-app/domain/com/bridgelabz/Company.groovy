package com.bridgelabz

class Company {
    String comp_Name;
    String product;
    Integer capacity;
    String city;

    static hasMany = [employee: Employee];
    static constraints = {
        comp_Name size: 4..40,blank: false,unique: true;
        product size: 4..40,blank: false
        capacity min: 15,max: 80, blank: false
        city size: 4..40, blank: false
    }
    String toString(){
        comp_Name;
    }
}
