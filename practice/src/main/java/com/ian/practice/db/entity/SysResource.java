package com.ian.practice.db.entity;

import com.ian.practice.db.BaseEntity;

import javax.persistence.*;

@Table(name = "sys_resource")
public class SysResource extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String url;

    @Column(name = "menu_id")
    private String menuId;

    @Column(name = "perm_name")
    private String permName;

    private String perm;

    private Byte status;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return menu_id
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * @return perm_name
     */
    public String getPermName() {
        return permName;
    }

    /**
     * @param permName
     */
    public void setPermName(String permName) {
        this.permName = permName;
    }

    /**
     * @return perm
     */
    public String getPerm() {
        return perm;
    }

    /**
     * @param perm
     */
    public void setPerm(String perm) {
        this.perm = perm;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}