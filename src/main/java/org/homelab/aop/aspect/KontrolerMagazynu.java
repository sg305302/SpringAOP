package org.homelab.aop.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KontrolerMagazynu {

    @Pointcut("execution(* org.homelab.aop.api.IKucharz.pobierzSkladnik(..))")
    public void poinCut(){};

    @Before("poinCut()")
    public void sprawdzSkladnikiMag(){
        System.out.println("AOP: sprwadzam Stan magaz.");
    }

    @AfterThrowing("execution(* org.homelab.aop.api.IKucharz.pobierzSkladnik(..))")
    public  void sygnalizujBrakWMag(){
        System.out.println("AOP: brak w  magaz!!!");
    }
}
