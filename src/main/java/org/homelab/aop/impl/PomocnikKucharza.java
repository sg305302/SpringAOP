package org.homelab.aop.impl;

import org.homelab.aop.api.IKucharz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PomocnikKucharza implements IKucharz {

    @Autowired
    @Qualifier("pomocnik_kucharza")
    private IKucharz kucharz;

    public void pobierzSkladnik() {
        System.out.println("*Pomocnik Pobiera skladniki");
    }

    @Override
    public void pobierzSkladnik(int liczbaSkladnikow) {
        System.out.println("*Pomocnik Pobiera skladniki: "+liczbaSkladnikow);
    }

    public void przygotujPizze() {
        System.out.println("*pomocnik oddelegowuje  przygotowanie");
        kucharz.przygotujPizze();
    }

    @Override
    public void przygotujPizze(int idpizza) {
        System.out.println("*pomocnik oddelegowuje przygotowanie pizzy  o id: "+idpizza);
        kucharz.przygotujPizze(idpizza);
    }

    public void wydajPizze() {
        System.out.println("* pomocnik Wydaje Pizze");
    }
}
