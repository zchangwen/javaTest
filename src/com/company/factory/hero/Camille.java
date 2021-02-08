/**
 * @作者 Zcw
 * @注释 detail
 * @创建时间 2021/2/7 下午2:07
 */
package com.company.factory.hero;

import com.company.factory.ISkill;

public class Camille implements ISkill {
    public void q() {
        System.out.printf("Camille Q");
    }

    public void w() {
        System.out.printf("Camille W");
    }

    public void e() {
        System.out.printf("Camille E");
    }

    public void r() {
        System.out.printf("Camille R");
    }
}
