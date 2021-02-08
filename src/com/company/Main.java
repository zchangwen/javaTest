package com.company;

import com.company.factory.HeroFactory;
import com.company.factory.ISkill;
import com.company.factory.hero.Camille;
import com.company.factory.hero.Diana;
import com.company.factory.hero.Irelia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        String name = Main.getUserInput();
        ISkill iSkill = HeroFactory.getHero(name);
        iSkill.q();
    }


    private static String getUserInput() {
        System.out.printf("请输入名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}
