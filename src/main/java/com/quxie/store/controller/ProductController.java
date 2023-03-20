package com.quxie.store.controller;

import com.quxie.store.entity.Product;
import com.quxie.store.service.IProductService;
import com.quxie.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController extends BaseController {
    @Autowired
    private IProductService productService;

    @RequestMapping("hot_list")
    public JsonResult<List<Product>> getHotList() {
        List<Product> data = productService.findHotList();
        return new JsonResult<List<Product>>(OK, data);
    }

    @GetMapping("{id}/details")
    public JsonResult<Product> getById(@PathVariable("id") Integer id) {
        // 调用业务对象执行获取数据
        Product data = productService.findById(id);
        // 返回成功和数据
        return new JsonResult<Product>(OK, data);
    }

    @GetMapping("category/{categoryId}")
    public JsonResult<List<Product>> getByCategoryId(@PathVariable("categoryId") Integer categoryId) {
        // 调用业务对象执行获取数据
        List<Product> data = productService.findByParentId(categoryId);
        // 返回成功和数据
        return new JsonResult<List<Product>>(OK, data);
    }
}
