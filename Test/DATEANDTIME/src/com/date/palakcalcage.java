package com.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class palakcalcage {
	public static void main(String[] args) {
		
	
 LocalDate today = LocalDate.now();
 LocalDate birthday = LocalDate.of(1997,Month.OCTOBER,31);
 Period p = Period.between(birthday,today);
 
System.out.print("days "+  p.getDays());
System.out.print("months "+ p.getMonths());
System.out.print("years "+ p.getYears());



 
	}}


