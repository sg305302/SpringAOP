package org.homelab.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Komunikacja {

    @Pointcut("args(argInt)")
    public void pointCutInt(int argInt){}

    //@Pointcut("target(org.homelab.aop.api.IKucharz+)") implementacje interfejsu
    @Pointcut("target(org.homelab.aop.api.IKucharz)")
    public void pointCutTarget(){}

   // @Pointcut("within(org.homelab.aop.impl.Kucharz) && pointCutInt(arg)")// mozna łączyć
   // @Pointcut("!within(org.homelab.aop.impl.Kucharz) && pointCutInt(arg)")// negacja  i mozna łączyć
    @Pointcut("within(org.homelab.aop.impl.Kucharz)")
    public void pointCutWithin(){}

    @Pointcut("target(annotation)") //before
    public void pointCutAnnot(Deprecated annotation){}


    @Before("pointCutInt(arg)")
    public void poradaInt(int arg){
        System.out.println("AOP: porada int: "+arg);
    }

    @Before("pointCutTarget()")
    public void poradaTarget(){
        System.out.println("AOP: Porada targetu ***");
    }

    @Before("pointCutWithin()")
    public void poradaWithin(){
        System.out.println("AOP: Porada clasy ***");
    }

    @After("execution(* org.homelab.aop.api.IKucharz.pobierzSkladnik(..)) && args(liczba)")
    public void poinformujOwydaniuZmag(int liczba){
        System.out.println("AOP: Stan Jest OK Liczba "+liczba);
    }


    @After("execution(* org.homelab.aop.api.IKucharz.pobierzSkladnik(..))")
    public void poinformujOwydaniuZmag(){
        System.out.println("AOP: Stan Jest OK");
    }

    //@AfterReturning("")
    @Around("execution(* org.homelab.aop.api.IKucharz.wydajPizze(..))")
    public void wydajPizze(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("AOP: Przed wydaniem P..");
            joinPoint.proceed();
            System.out.println("AOP: Po wydaniem P..");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
