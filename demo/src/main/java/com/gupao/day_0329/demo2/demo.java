package com.gupao.day_0329.demo2;

/**
 * 迪米特法则-最少知道原则
 * BOOS - LEADER-EMPLOYEE
 * BOOS里直接获取结果,尽量与EMPLOYEE无交集
 *
 */
public class demo {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
