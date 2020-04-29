package org.homelab.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.homelab.aop.api.IZapiekanka;
import org.homelab.aop.impl.Zapiekanka;

@Aspect
public class AspectZapiekanka {

    @DeclareParents(value = "org.homelab.aop.api.IKucharz+",defaultImpl = Zapiekanka.class)
    public static IZapiekanka zapiekanka;
}
