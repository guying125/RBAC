/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2020-08-11 00:33 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.util;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.function.Consumer;

/**
 * 描述：SQL批量操作工具类
 *
 * @author CODE POTER
 * @version 1.0
 */
public class SqlBatchActionUtil {
    private SqlBatchActionUtil() {
    }

    public static final Integer BATCH_SIZE = 500;

    /**
     * 在使用时，使用@Resource的方式注入SqlSessionFactory
     *
     * @param sqlSessionFactory 。。。
     * @param batchList         批量操作的记录
     * @param batchSize         批量操作的尺寸
     * @param consumer          指定单处理的方法
     * @param <T>               泛型
     */
    public static <T> void doBatch(SqlSessionFactory sqlSessionFactory,
                                   List<T> batchList,
                                   int batchSize,
                                   Consumer<T> consumer) {
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
        int count = 0;
        try {
            for (T t : batchList) {
                consumer.accept(t);
                ++count;

                if (count >= batchSize) {
                    count = 0;
                    sqlSession.flushStatements();
                    sqlSession.commit();
                }
            }

            if (count > 0) {
                sqlSession.flushStatements();
                sqlSession.commit();
            }
        } finally {
            sqlSession.clearCache();
            sqlSession.close();
        }
    }
}
