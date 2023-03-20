package com.quxie.store.controller;

import com.quxie.store.entity.PracCalligraphy;
import com.quxie.store.service.PracCalligraphyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PracCalligraphy)表控制层
 *
 * @author makejava
 * @since 2022-04-19 20:13:30
 */
@RestController
@RequestMapping("pracCalligraphy")
public class PracCalligraphyController {
    /**
     * 服务对象
     */
    @Resource
    private PracCalligraphyService pracCalligraphyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PracCalligraphy selectOne(Integer id) {
        return this.pracCalligraphyService.queryById(id);
    }

}
