package org.homelab.aop;

import org.homelab.aop.api.IKucharz;
import org.homelab.aop.api.IZapiekanka;
import org.homelab.aop.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //IKucharz kucharz = context.getBean(IKucharz.class);
        IKucharz kucharz = (IKucharz) context.getBean("kucharz");
        ((IZapiekanka)kucharz).przygotujZapiek();

//        kucharz.pobierzSkladnik();
        kucharz.pobierzSkladnik(1);
//        kucharz.przygotujPizze();
//        kucharz.przygotujPizze(2);
//        kucharz.wydajPizze();
//        IKucharz pomocnik = (IKucharz) context.getBean("pomocnikKucharza");
//        pomocnik.pobierzSkladnik();
    }
}
