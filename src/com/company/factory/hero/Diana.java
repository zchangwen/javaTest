/**
 * @作者 Zcw
 * @注释 detail
 * @创建时间 2021/2/7 下午1:22
 */
package com.company.factory.hero;

import com.company.factory.ISkill;

public class Diana implements ISkill {
    public void q() {
        System.out.printf("Diana Q");
    }

    public void w() {
        System.out.printf("Diana W");
    }

    public void e() {
        System.out.printf("Diana E");
    }

    public void r() {
        System.out.printf("Diana R");
    }
}
