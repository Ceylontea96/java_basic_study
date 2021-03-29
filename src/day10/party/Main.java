package day10.party;

import day09.inherit.player.Hunter;
import day09.inherit.player.Mage;
import day09.inherit.player.Player;
import day09.inherit.player.Warrior;

public class Main {

    public static void main(String[] args) {

        //파티 생성
        Party party = new Party(3);

        //파티원 추가
        party.addPlayer(new Warrior("전사맨뽀로로"));
        party.addPlayer(new Hunter("안녕하셈까"));
        party.addPlayer(new Mage("주차왕파킹"));
        party.addPlayer(new Player("매직왕마술사"));

        party.kickPlayer("전사맨뽀로로");

        party.showPartyInfo();

    }
}
