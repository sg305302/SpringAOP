package org.homelab.aop.impl;

import org.homelab.aop.api.IKucharz;

public class Kucharz implements IKucharz {
    public void pobierzSkladnik() {
        System.out.println("*Pobieram skladniki");
    }

    @Override
    public void pobierzSkladnik(int liczbaSkladnikow) {
        System.out.println("*Pobieram skladniki: "+liczbaSkladnikow);
    }

    public void przygotujPizze() {
        System.out.println("*Robie Pizze");
    }

    @Override
    public void przygotujPizze(int idpizza) {
        System.out.println("*Robie Pizze o id: "+idpizza);
    }

    public void wydajPizze() {
        System.out.println("*Wydaje Pizze");
    }
}
