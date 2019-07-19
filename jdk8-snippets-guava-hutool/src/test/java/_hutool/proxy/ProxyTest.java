package _hutool.proxy;

import cn.hutool.aop.ProxyUtil;
import entity.animal.Cat;
import entity.IAnimal;

public class ProxyTest {
    public static void main(String[] args) {

        IAnimal cat = ProxyUtil.proxy(new Cat(), TimeIntervalAspect.class);

        cat.eat();
        cat.eat();
        cat.eat();

    }
}
