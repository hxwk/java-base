package cn.itcast.base.oop.duotai;

/**
 * Author itcast
 * Date 2022/2/26 11:43
 * Desc TODO
 */
public class WaterTest {
    public static void main(String[] args) {
        //液态水
        Water water = new Water();
        water.status();
        //冰
        Water ice = new Ice();
        ice.status();
        //汽态
        Water steam = new Steam();
        steam.status();
    }
}
