package com.quxie.store.service.impl;

import com.quxie.store.entity.Calligraphy;
import com.quxie.store.dao.CalligraphyDao;
import com.quxie.store.service.CalligraphyService;
import com.quxie.store.service.ex.AccessDeniedException;
import com.quxie.store.service.ex.CalligraphyNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Calligraphy)表服务实现类
 *
 * @author makejava
 * @since 2022-04-19 20:08:10
 */
@Service("calligraphyService")
public class CalligraphyServiceImpl implements CalligraphyService {
    @Autowired
    private CalligraphyDao calligraphyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param zid 主键
     * @return 实例对象
     */
    @Override
    public Calligraphy queryById(Integer zid) {
        Calligraphy calligraphy = calligraphyDao.queryById(zid);
        if (calligraphy == null) {
            throw new CalligraphyNotFoundException("没有找到对应的字帖");
        }
        return calligraphy;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Calligraphy> queryAllByLimit(int offset, int limit) {
        if (offset < 0 || limit < 0) throw new AccessDeniedException("分页参数不合法");
        return calligraphyDao.queryAllByLimit(offset, limit);
    }
    /**
     * 新增数据
     *
     * @param calligraphy 实例对象
     * @return 实例对象
     */
    @Override
    public Calligraphy insert(Calligraphy calligraphy) {
        if(this.calligraphyDao.insert(calligraphy)<1){
            throw new CalligraphyNotFoundException("没有找到对应的字帖");
        }
        return calligraphy;
    }

    /**
     * 修改数据
     *
     * @param calligraphy 实例对象
     * @return 实例对象
     */
    @Override
    public Calligraphy update(Calligraphy calligraphy) {

        if(this.calligraphyDao.update(calligraphy)<1){
            throw new CalligraphyNotFoundException("没有找到对应的字帖");
        }
        return calligraphy;

    }

    /**
     * 通过主键删除数据
     *
     * @param zid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer zid) {
        if(this.calligraphyDao.deleteById(zid)<1){
            throw new CalligraphyNotFoundException("没有找到对应的字帖");
        }
        return true;
    }
}
