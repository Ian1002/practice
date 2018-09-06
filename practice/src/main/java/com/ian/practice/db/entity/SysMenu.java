package com.ian.practice.db.entity;

import com.ian.practice.db.BaseEntity;

import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu extends BaseEntity {

    private String name;

    @Column(name = "router_url")
    private String routerUrl;

    private String icon;

    private Byte status;

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
     * @return router_url
     */
    public String getRouterUrl() {
        return routerUrl;
    }

    /**
     * @param routerUrl
     */
    public void setRouterUrl(String routerUrl) {
        this.routerUrl = routerUrl;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
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