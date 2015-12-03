package com.wenpingao.qe.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by WenPinGao on 2015/9/29.
 */
public class DbConnection {
    public static SqlSession getSqlSession() throws Exception {
        InputStream inputStream = Resources
                .getResourceAsStream("/SqlMapConfig.xml");//SqlMapConfig.xml�ļ���webapp/WEB-INF/classesĿ¼��
        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(inputStream);
        // 2.ͨ�������õ�SqlSession
        SqlSession session = factory.openSession();
        return session;
    }
}
