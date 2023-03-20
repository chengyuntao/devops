package com.quxie.store.service.impl;

import com.quxie.store.entity.PracCalligraphy;
import com.quxie.store.dao.PracCalligraphyDao;
import com.quxie.store.service.PracCalligraphyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PracCalligraphy)表服务实现类
 *
 * @author makejava
 * @since 2022-04-19 20:13:30
 */
@Service("pracCalligraphyService")
public class PracCalligraphyServiceImpl implements PracCalligraphyService {
    @Resource
    private PracCalligraphyDao pracCalligraphyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PracCalligraphy queryById(Integer id) {
        return this.pracCalligraphyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PracCalligraphy> queryAllByLimit(int offset, int limit) {
        return this.pracCalligraphyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pracCalligraphy 实例对象
     * @return 实例对象
     */
    @Override
    public PracCalligraphy insert(PracCalligraphy pracCalligraphy) {
        this.pracCalligraphyDao.insert(pracCalligraphy);
        return pracCalligraphy;
    }

    /**
     * 修改数据
     *
     * @param pracCalligraphy 实例对象
     * @return 实例对象
     */
    @Override
    public PracCalligraphy update(PracCalligraphy pracCalligraphy) {
        this.pracCalligraphyDao.update(pracCalligraphy);
        return this.queryById(pracCalligraphy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pracCalligraphyDao.deleteById(id) > 0;
    }
}
