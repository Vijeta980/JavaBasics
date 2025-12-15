package com.pedia;

 class Emp {
	 int id;
	 String name;
	 int basic;
	 int da;
	 int hra;
	 int salary;
	 
	 Emp(int id,String name,int basic,int da,int hra){
		 this.id=id;
		 this.name=name;
		 this.basic=basic;
		 this.da=da;
		 this.hra=hra;
		 
	 }
	 void computeSalary() {
		 salary=basic+hra+da;
	 }
	 
	 void printSalarySlip() {
		 System.out.println(id+" "+name+" "+basic+" "+hra+" "+da+" "+salary);
	 }

}
 
 class Manager extends Emp{
	 int perks;
	 
	 Manager(int id, String name, int basic, int da, int hra,int perks) {
		super(id, name, basic, da, hra);
		this.perks=perks;
	}
	 
	 void computeSalary() {
		 salary=basic+hra+da+perks;
	 }
	 
	 void printSalarySlip() {
		 System.out.println(id+" "+name+" "+basic+" "+hra+" "+da+" "+perks+" "+salary);
	 }
		 
	 
 }
 
 //Main
 public class Employee{
	 public static void main(String[] args) {
		 Emp ken=new Emp(1,"Thomson",1000,10,20);
		 ken.computeSalary();
		 ken.printSalarySlip();
		 
		 Manager dennis=new Manager(2,"Dennis",2000,20,40,60);
		 dennis.computeSalary();
		 dennis.printSalarySlip();
		
	}
 }
