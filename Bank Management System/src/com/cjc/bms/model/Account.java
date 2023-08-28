package com.cjc.bms.model;

public class Account {
	private int AccNo;
	private String Name;
	private long MobnO;
	private long Adharno;
	private String Gender;
	private byte Age;
	private double Balance;
	public int getAccNo()
	{
		return AccNo;
	}
	public void setAccNo(int accNo) 
	{
		AccNo = accNo;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	public long getMobnO() 
	{
		return MobnO;
	}
	public void setMobnO(long mobnO) 
	{
		MobnO = mobnO;
	}
	public long getAdharno()
	{
		return Adharno;
	}
	public void setAdharno(long adharno)
	{
		Adharno = adharno;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) 
	{
		Gender = gender;
	}
	public byte getAge() 
	{
		return Age;
	}
	public void setAge(byte age)
	{
		Age = age;
	}
	public double getBalance() 
	{
		return Balance;
	}
	public void setBalance(double balance) 
	{
		Balance = balance;
	}

}
