package com.ian.practice.db.entity;

import com.ian.practice.db.BaseEntity;

import javax.persistence.*;

@Table(name = "price_factor_tag")
public class PriceFactorTag extends BaseEntity {
    /**
     * 价格因子ID
     */
    @Id
    @Column(name = "price_factor_id")
    private Long priceFactorId;

    /**
     * 标签ID
     */
    @Id
    @Column(name = "tag_id")
    private Long tagId;

    /**
     * 获取价格因子ID
     *
     * @return price_factor_id - 价格因子ID
     */
    public Long getPriceFactorId() {
        return priceFactorId;
    }

    /**
     * 设置价格因子ID
     *
     * @param priceFactorId 价格因子ID
     */
    public void setPriceFactorId(Long priceFactorId) {
        this.priceFactorId = priceFactorId;
    }

    /**
     * 获取标签ID
     *
     * @return tag_id - 标签ID
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 设置标签ID
     *
     * @param tagId 标签ID
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}