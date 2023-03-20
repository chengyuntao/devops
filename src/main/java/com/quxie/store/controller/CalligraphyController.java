package com.quxie.store.controller;

import com.quxie.store.entity.Calligraphy;
import com.quxie.store.service.CalligraphyService;
import com.quxie.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.quxie.store.controller.BaseController.OK;

/**
 * (Calligraphy)表控制层
 *
 * @author makejava
 * @since 2022-04-19 20:08:10
 */
@RestController
@RequestMapping("calligraphy")
public class CalligraphyController {
    /**
     * 服务对象
     */
    @Autowired
    private CalligraphyService calligraphyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public JsonResult<Calligraphy>getById(@PathVariable Integer id) {
        Calligraphy calligraphy = this.calligraphyService.queryById(id);
        return new JsonResult<Calligraphy>(OK,calligraphy);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @GetMapping("{offset}/{limit}")
    public JsonResult<List<Calligraphy>> queryAllByLimit(@RequestParam(value = "offset", defaultValue = "0") int offset,
                                                         @RequestParam(value = "limit", defaultValue = "10") int limit) {
        return new JsonResult<List<Calligraphy>>(OK,this.calligraphyService.queryAllByLimit(offset,limit));
    }

    /**
     * 新增数据
     *
     * @param calligraphy 实例对象
     * @return 实例对象
     */
    @PostMapping()
    public JsonResult<Calligraphy> insert(@RequestBody Calligraphy calligraphy) {
        this.calligraphyService.insert(calligraphy);
        return new JsonResult<Calligraphy>(OK,calligraphy);
    }

    /**
     * 修改数据
     *
     * @param calligraphy 实例对象
     * @return 实例对象
     */
    @PutMapping()
    public JsonResult<Calligraphy> update(@RequestBody Calligraphy calligraphy) {
        this.calligraphyService.update(calligraphy);
        return new JsonResult<Calligraphy>(OK,calligraphy);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("{id}")
    public JsonResult<Calligraphy> deleteById(@RequestParam Integer id) {
        this.calligraphyService.deleteById(id);
        return new JsonResult<Calligraphy>(OK,null);
    }
}
