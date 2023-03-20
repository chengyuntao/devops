package com.quxie.store.mapper;

import com.quxie.store.entity.Product;

import java.util.List;

/** 处理商品数据的持久层接口 */
public interface ProductMapper {
    /**
     * 查询热销商品的前四名
     * @return 热销商品前四名的集合
     */
    List<Product> findHotList();

    /**
     * 根据商品id查询商品详情
     * @param id 商品id
     * @return 匹配的商品详情，如果没有匹配的数据则返回null
     */
    Product findById(Integer id);

    /**
     * 根据商品父id得到商品列表
     * @param parentId 商品父id
     * @return 匹配的商品列表，如果没有匹配的数据则返回null
     */
    List<Product> findByParentId(Integer parentId);

}
