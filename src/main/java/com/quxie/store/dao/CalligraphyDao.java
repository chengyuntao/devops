package com.quxie.store.dao;

import com.quxie.store.entity.Calligraphy;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Calligraphy)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-19 20:09:59
 */
public interface CalligraphyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param zid 主键
     * @return 实例对象
     */
    Calligraphy queryById(Integer zid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Calligraphy> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param calligraphy 实例对象
     * @return 对象列表
     */
    List<Calligraphy> queryAll(Calligraphy calligraphy);

    /**
     * 新增数据
     *
     * @param calligraphy 实例对象
     * @return 影响行数
     */
    int insert(Calligraphy calligraphy);

    /**
     * 修改数据
     *
     * @param calligraphy 实例对象
     * @return 影响行数
     */
    int update(Calligraphy calligraphy);

    /**
     * 通过主键删除数据
     *
     * @param zid 主键
     * @return 影响行数
     */
    int deleteById(Integer zid);

}
