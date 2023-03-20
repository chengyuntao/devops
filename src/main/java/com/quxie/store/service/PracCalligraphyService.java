package com.quxie.store.service;

import com.quxie.store.entity.PracCalligraphy;
import java.util.List;

/**
 * (PracCalligraphy)表服务接口
 *
 * @author makejava
 * @since 2022-04-19 20:13:30
 */
public interface PracCalligraphyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PracCalligraphy queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PracCalligraphy> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pracCalligraphy 实例对象
     * @return 实例对象
     */
    PracCalligraphy insert(PracCalligraphy pracCalligraphy);

    /**
     * 修改数据
     *
     * @param pracCalligraphy 实例对象
     * @return 实例对象
     */
    PracCalligraphy update(PracCalligraphy pracCalligraphy);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
