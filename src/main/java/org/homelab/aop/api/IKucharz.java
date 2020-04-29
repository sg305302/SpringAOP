package org.homelab.aop.api;

public interface IKucharz {
    void pobierzSkladnik();
    void pobierzSkladnik(int liczbaSkladnikow);
    void przygotujPizze();
    void przygotujPizze(int idpizza);
    void wydajPizze();
}
