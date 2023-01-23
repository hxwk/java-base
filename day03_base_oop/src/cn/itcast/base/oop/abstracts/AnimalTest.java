package cn.itcast.base.oop.abstracts;

/**
 * Author itcast
 * Date 2022/2/26 17:34
 * Desc TODO
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        };

        //匿名内部类
        print(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃狗粮");
            }
        });
    }

    /**
     * 这个方法调用 Animal 动物类的 吃的行为
     * @param animal
     */
    public static void print(Animal animal){
        animal.eat();
        Bird bird = new Bird();
        bird.setWings(2);
        bird.setLegs(4);
        String s = bird.toString();
        System.out.println(s);
    }

    static class Bird{
        private int legs = 2;
        private int wings = 2;
        public void fly(){
            System.out.println("鸟会飞");
        }

        public int getLegs() {
            return legs;
        }

        public void setLegs(int legs) {
            this.legs = legs;
        }

        public int getWings() {
            return wings;
        }

        public void setWings(int wings) {
            this.wings = wings;
        }

        @Override
        public String toString() {
            return "Bird{" +
                    "legs=" + legs +
                    ", wings=" + wings +
                    '}';
        }
    }
}
