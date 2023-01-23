package cn.itcast.base.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author itcast
 * Date 2022/3/4 14:43
 * Desc 单元测试、集成测试、功能测试
 */
public class JunitDemo {

    @Before
    public void before(){
        System.out.println("创建数据库的连接！");
    }

    @Test
    public void insert(){
        System.out.println("将记录插入到数据表中！");
    }

    @After
    public void close(){
        System.out.println("关闭数据库的连接");
    }
}
