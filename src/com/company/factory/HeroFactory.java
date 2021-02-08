/**
 * @作者 Zcw
 * @注释 detail
 * @创建时间 2021/2/7 下午4:05
 */
package com.company.factory;

import com.company.factory.hero.Camille;
import com.company.factory.hero.Diana;
import com.company.factory.hero.Irelia;

public class HeroFactory {
    public static ISkill getHero(String name) throws Exception {

        // 简单工厂，由于用户输入不可控，则简单工厂造成不稳定因素
//        return HeroFactory.sipFactory(name);

        // 抽象工厂
        return HeroFactory.absFactory(name);
    }

    private static ISkill absFactory(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 直接使用是没有缓存机制，每次都需要反射一次
        String packageName = "com.company.factory.hero." + name;
        Class<?> cla = Class.forName(packageName);
        Object obj = cla.newInstance();
        return (ISkill) obj;
    }

    // 简单工厂
    private static ISkill sipFactory(String name) throws Exception {
        ISkill iSkill;
        switch (name) {
            case "Diana":
                iSkill = new Diana();
                break;
            case "Camille":
                iSkill = new Camille();
                break;
            case "Irelia":
                iSkill = new Irelia();
                break;
            default:
                throw new Exception();
        }
        return iSkill;
    }
}
