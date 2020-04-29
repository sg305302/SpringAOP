package org.homelab.aop.config;

import org.homelab.aop.api.IKucharz;
import org.homelab.aop.api.IZapiekanka;
import org.homelab.aop.aspect.AspectZapiekanka;
import org.homelab.aop.aspect.Komunikacja;
import org.homelab.aop.aspect.KontrolerMagazynu;
import org.homelab.aop.impl.Kucharz;
import org.homelab.aop.impl.PomocnikKucharza;
import org.homelab.aop.impl.Zapiekanka;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public IZapiekanka zapiekanka(){
        return new Zapiekanka();
    }

    @Bean
    public AspectZapiekanka aspectZapiekanka(){
        return new AspectZapiekanka();
    }

    @Bean
    @Qualifier("kucharz")
    public IKucharz kucharz(){
        return new Kucharz();
    }

    @Bean
    @Qualifier("pomocnik_kucharza")
    public IKucharz pomocnikKucharza(){
        return new PomocnikKucharza();
    }

    @Bean
    public Komunikacja komunikacja(){
        return  new Komunikacja();
    }

    @Bean
    public KontrolerMagazynu kontrolerMagazynu(){
        return  new KontrolerMagazynu();
    }
}
