package cn.itcast.base.oop.examples;

/**
 * Author itcast
 * Date 2022/2/26 17:05
 * Desc TODO
 */
public class Test {
    public static void main(String[] args) {
        /*PingpangPlayer player1 = new PingpangPlayer();
        player1.study();
        player1.eat();
        player1.setName("邓亚萍");
        player1.setAge(30);
        String play = player1.toString();
        player1.speakEnglish();
        player1.speakFranch();*/
        PingpangCoach coach = new PingpangCoach();
        coach.setName("刘国梁");
        coach.setAge(50);
        coach.speakEnglish();
        coach.eat();
        coach.useJava();
        coach.toString();
    }
}
