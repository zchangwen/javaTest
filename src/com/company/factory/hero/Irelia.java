/**
 * @作者 Zcw
 * @注释 detail
 * @创建时间 2021/2/7 下午2:04
 */
package com.company.factory.hero;

import com.company.factory.ISkill;

public class Irelia implements ISkill {
    public void q() {
        System.out.printf("Irelia Q");
    }

    public void w() {
        System.out.printf("Irelia W");
    }

    public void e() {
        System.out.printf("Irelia E");
    }

    public void r() {
        System.out.printf("Irelia R");
    }
}
