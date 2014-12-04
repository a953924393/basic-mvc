package com.wodsy.dao;

import com.wodsy.mybatis.page.Pagination;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:spring*.xml"})
public class UserMapperTest extends TestCase {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        userMapper.selectByPrimaryKey(1);
    }

    @Test
    public void testSelectAll() {
        userMapper.selectAllByPage(1,"hehe", new Pagination());
    }
}