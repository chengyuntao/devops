package com.quxie.store.service;

import com.quxie.store.entity.Calligraphy;

import java.util.List;

/**
 * (Calligraphy)表服务接口
 *
 * @author makejava
 * @since 2022-04-19 20:08:10
 */
public interface CalligraphyService {

    /**
     * 通过ID查询单条数据
     *
     * @param zid 主键
     * @return 实例对象
     */
    Calligraphy queryById(Integer zid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Calligraphy> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param calligraphy 实例对象
     * @return 实例对象
     */
    Calligraphy insert(Calligraphy calligraphy);

    /**
     * 修改数据
     *
     * @param calligraphy 实例对象
     * @return 实例对象
     */
    Calligraphy update(Calligraphy calligraphy);

    /**
     * 通过主键删除数据
     *
     * @param zid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer zid);

}
