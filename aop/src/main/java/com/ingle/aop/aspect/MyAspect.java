package com.ingle.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;




@Aspect
public class MyAspect {
 // * means all return type 
	@Before(value = "execution(* com.ingle.service.PaymentServicesImp.makepayment(..))")
	public void printBefore() {
		System.out.println("Payment started..");
	}
	@After(value = "execution(* com.ingle.service.PaymentServicesImp.makepayment(..))")
	public void printAfter() {
		System.out.println("Payment close..");
	}
}
