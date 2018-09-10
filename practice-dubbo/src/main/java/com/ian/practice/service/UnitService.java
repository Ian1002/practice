package com.ian.practice.service;

import com.github.pagehelper.PageInfo;
import com.ian.practice.db.entity.BaseUnit;
import com.ian.practice.model.BaseUnitModel;
import org.springframework.stereotype.Service;


/**
 * UnitService
 *
 * @author YangJing
 * @date 2018/8/30 15:06
 */
public interface UnitService {

    /**
     * 查询单位列表
     *
     * @param model
     * @return
     */
    PageInfo<BaseUnit> listPage(BaseUnitModel model);
}
