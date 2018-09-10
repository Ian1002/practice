package com.ian.practice.db.entity;

import com.ian.practice.db.BaseEntity;

import javax.persistence.*;

@Table(name = "result_set_pf")
public class ResultSetPf extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 结果集ID
     */
    @Column(name = "rs_id")
    private Long rsId;

    /**
     * 因子ID
     */
    @Column(name = "pf_id")
    private Long pfId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取结果集ID
     *
     * @return rs_id - 结果集ID
     */
    public Long getRsId() {
        return rsId;
    }

    /**
     * 设置结果集ID
     *
     * @param rsId 结果集ID
     */
    public void setRsId(Long rsId) {
        this.rsId = rsId;
    }

    /**
     * 获取因子ID
     *
     * @return pf_id - 因子ID
     */
    public Long getPfId() {
        return pfId;
    }

    /**
     * 设置因子ID
     *
     * @param pfId 因子ID
     */
    public void setPfId(Long pfId) {
        this.pfId = pfId;
    }
}