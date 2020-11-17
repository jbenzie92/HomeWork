package com.johncodes;

public class ProTeam {

private String name;
private String player;
private String mascot;
private int titles;
private boolean wonTitle;

ProTeam(){};

ProTeam(String name, String player){

};

    ProTeam(String name, String player, int titles){

    };

    public void setWonTitle (boolean wonTitle) {
        this.wonTitle = wonTitle;
    }

    public String getName() {
        return name;
    }

    public String getPlayer() {
        return player;
    }

    public String getMascot() {
        return mascot;
    }

    public int getTitles() {
        return titles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    public static void champWinners (Boolean wonTitle){
        System.out.println(wonTitle);
    }

    public static void printName (String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        ProTeam lakers = new ProTeam();
        lakers.setName("Lakers");
        printName(lakers.name);
        lakers.setWonTitle(true);
        champWinners(lakers.wonTitle);

    }

}
