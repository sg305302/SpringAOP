package org.homelab.aop.impl;

import org.homelab.aop.api.IZapiekanka;

public class Zapiekanka implements IZapiekanka {
    @Override
    public void przygotujZapiek() {
        System.out.println("AOP: * Robie zapiekanke");
    }
}
