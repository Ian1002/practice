package com.ian.practice.db.entity;

import com.ian.practice.db.BaseEntity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "result_set")
public class ResultSet extends BaseEntity {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 结果集code
     */
    private String code;

    /**
     * 结果集名称
     */
    private String name;

    /**
     * 状态 0-未启用 1-启用 2-废弃
     */
    private Byte status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取结果集code
     *
     * @return code - 结果集code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置结果集code
     *
     * @param code 结果集code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取结果集名称
     *
     * @return name - 结果集名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置结果集名称
     *
     * @param name 结果集名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取状态 0-未启用 1-启用 2-废弃
     *
     * @return status - 状态 0-未启用 1-启用 2-废弃
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 0-未启用 1-启用 2-废弃
     *
     * @param status 状态 0-未启用 1-启用 2-废弃
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}