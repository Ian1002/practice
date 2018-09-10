package com.ian.practice.db.entity;

import com.ian.practice.db.BaseEntity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "price_factor_ref")
public class PriceFactorRef extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 所属因子ID
     */
    @Column(name = "pf_id")
    private Long pfId;

    /**
     * 类型 1-值，2-公式，3-参数
     */
    private Byte type;

    /**
     * 关联因子ID
     */
    @Column(name = "ref_pf_id")
    private Long refPfId;

    /**
     * 值
     */
    private BigDecimal digit;

    /**
     * 运算符 1-+，2--，3-*，4-/,5-%
     */
    private Byte symbol;

    /**
     * 上级ID
     */
    @Column(name = "parent_id")
    private Long parentId;

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
     * 获取所属因子ID
     *
     * @return pf_id - 所属因子ID
     */
    public Long getPfId() {
        return pfId;
    }

    /**
     * 设置所属因子ID
     *
     * @param pfId 所属因子ID
     */
    public void setPfId(Long pfId) {
        this.pfId = pfId;
    }

    /**
     * 获取类型 1-值，2-公式，3-参数
     *
     * @return type - 类型 1-值，2-公式，3-参数
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置类型 1-值，2-公式，3-参数
     *
     * @param type 类型 1-值，2-公式，3-参数
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取关联因子ID
     *
     * @return ref_pf_id - 关联因子ID
     */
    public Long getRefPfId() {
        return refPfId;
    }

    /**
     * 设置关联因子ID
     *
     * @param refPfId 关联因子ID
     */
    public void setRefPfId(Long refPfId) {
        this.refPfId = refPfId;
    }

    /**
     * 获取值
     *
     * @return digit - 值
     */
    public BigDecimal getDigit() {
        return digit;
    }

    /**
     * 设置值
     *
     * @param digit 值
     */
    public void setDigit(BigDecimal digit) {
        this.digit = digit;
    }

    /**
     * 获取运算符 1-+，2--，3-*，4-/,5-%
     *
     * @return symbol - 运算符 1-+，2--，3-*，4-/,5-%
     */
    public Byte getSymbol() {
        return symbol;
    }

    /**
     * 设置运算符 1-+，2--，3-*，4-/,5-%
     *
     * @param symbol 运算符 1-+，2--，3-*，4-/,5-%
     */
    public void setSymbol(Byte symbol) {
        this.symbol = symbol;
    }

    /**
     * 获取上级ID
     *
     * @return parent_id - 上级ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置上级ID
     *
     * @param parentId 上级ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}