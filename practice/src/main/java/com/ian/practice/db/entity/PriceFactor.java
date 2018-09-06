package com.ian.practice.db.entity;

import com.ian.practice.db.BaseEntity;

import javax.persistence.*;

@Table(name = "price_factor")
public class PriceFactor extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型,0-公式,1-参数
     */
    private Byte type;

    /**
     * 公式
     */
    private String formula;

    /**
     * 参数
     */
    private String parameter;

    /**
     * 单位ID
     */
    @Column(name = "unit_id")
    private Long unitId;

    /**
     * 状态,0-激活,1-失效
     */
    private Byte status;

    /**
     * 失效原因
     */
    @Column(name = "invalid_reason")
    private String invalidReason;

    /**
     * 权限,0-开放,1-私有
     */
    private Byte power;

    /**
     * 所属部门
     */
    @Column(name = "subordinate_departmentId")
    private Long subordinateDepartmentid;

    /**
     * 备注
     */
    private String remark;

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
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
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
     * 获取类型,0-公式,1-参数
     *
     * @return type - 类型,0-公式,1-参数
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置类型,0-公式,1-参数
     *
     * @param type 类型,0-公式,1-参数
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取公式
     *
     * @return formula - 公式
     */
    public String getFormula() {
        return formula;
    }

    /**
     * 设置公式
     *
     * @param formula 公式
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * 获取参数
     *
     * @return parameter - 参数
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * 设置参数
     *
     * @param parameter 参数
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * 获取单位ID
     *
     * @return unit_id - 单位ID
     */
    public Long getUnitId() {
        return unitId;
    }

    /**
     * 设置单位ID
     *
     * @param unitId 单位ID
     */
    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    /**
     * 获取状态,0-激活,1-失效
     *
     * @return status - 状态,0-激活,1-失效
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态,0-激活,1-失效
     *
     * @param status 状态,0-激活,1-失效
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取失效原因
     *
     * @return invalid_reason - 失效原因
     */
    public String getInvalidReason() {
        return invalidReason;
    }

    /**
     * 设置失效原因
     *
     * @param invalidReason 失效原因
     */
    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }

    /**
     * 获取权限,0-开放,1-私有
     *
     * @return power - 权限,0-开放,1-私有
     */
    public Byte getPower() {
        return power;
    }

    /**
     * 设置权限,0-开放,1-私有
     *
     * @param power 权限,0-开放,1-私有
     */
    public void setPower(Byte power) {
        this.power = power;
    }

    /**
     * 获取所属部门
     *
     * @return subordinate_departmentId - 所属部门
     */
    public Long getSubordinateDepartmentid() {
        return subordinateDepartmentid;
    }

    /**
     * 设置所属部门
     *
     * @param subordinateDepartmentid 所属部门
     */
    public void setSubordinateDepartmentid(Long subordinateDepartmentid) {
        this.subordinateDepartmentid = subordinateDepartmentid;
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
}