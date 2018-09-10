package com.ian.practice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ian.practice.db.entity.BaseUnit;
import com.ian.practice.db.mapper.BaseUnitMapper;
import com.ian.practice.model.BaseUnitModel;
import com.ian.practice.service.UnitService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * UnitServiceImpl
 *
 * @author YangJing
 * @date 2018/8/30 15:22
 */
@Service
public class UnitServiceImpl implements UnitService {

    @Resource
    private BaseUnitMapper unitMapper;

    @Override
    public PageInfo<BaseUnit> listPage(BaseUnitModel model) {

        Example unitExample = new Example(BaseUnit.class);
        Example.Criteria criteria = unitExample.createCriteria();

        if (StringUtils.isNotBlank(model.getName()))
            criteria.andEqualTo("name", model.getName());
        unitExample.orderBy("id").desc();

        PageHelper.startPage(model.getPageNum(), model.getPageSize());
        List<BaseUnit> units = unitMapper.selectByExample(unitExample);

        PageInfo<BaseUnit> pageInfo = new PageInfo<>(units);
        return pageInfo;
    }
}
