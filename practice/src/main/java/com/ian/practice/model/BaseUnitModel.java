package com.ian.practice.model;

import com.github.pagehelper.PageHelper;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class BaseUnitModel extends PageModel {
    /**
     * 单位表主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否有效:0-否，1是
     */
    private Integer isEnabled;

    /**
     * 创建人ID
     */
    private Long createId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Long updateId;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注，描述
     */
    private String remark;

    /**
     * 获取单位表主键
     *
     * @return id - 单位表主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置单位表主键
     *
     * @param id 单位表主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取是否有效:0-否，1是
     *
     * @return is_enabled - 是否有效:0-否，1是
     */
    public Integer getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否有效:0-否，1是
     *
     * @param isEnabled 是否有效:0-否，1是
     */
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取创建人ID
     *
     * @return create_id - 创建人ID
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 设置创建人ID
     *
     * @param createId 创建人ID
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
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
     * 获取修改人
     *
     * @return update_id - 修改人
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 设置修改人
     *
     * @param updateId 修改人
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
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

    /**
     * 获取备注，描述
     *
     * @return remark - 备注，描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注，描述
     *
     * @param remark 备注，描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}