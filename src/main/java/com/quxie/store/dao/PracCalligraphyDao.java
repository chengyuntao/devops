package com.quxie.store.dao;

import com.quxie.store.entity.PracCalligraphy;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PracCalligraphy)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-19 20:13:30
 */
public interface PracCalligraphyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PracCalligraphy queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PracCalligraphy> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pracCalligraphy 实例对象
     * @return 对象列表
     */
    List<PracCalligraphy> queryAll(PracCalligraphy pracCalligraphy);

    /**
     * 新增数据
     *
     * @param pracCalligraphy 实例对象
     * @return 影响行数
     */
    int insert(PracCalligraphy pracCalligraphy);

    /**
     * 修改数据
     *
     * @param pracCalligraphy 实例对象
     * @return 影响行数
     */
    int update(PracCalligraphy pracCalligraphy);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}
