package com.ian.practice.controller;

import com.ian.practice.model.BaseUnitModel;
import com.ian.practice.service.UnitService;
import com.ian.practice.util.ResultData;
import com.ian.practice.util.ResultDataFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UnitController
 *
 * @author YangJing
 * @date 2018/8/30 16:44
 */
@RestController
@RequestMapping("/unit")
public class UnitController extends BaseController {

    @Autowired
    private UnitService unitService;

    @PostMapping("/list")
    public ResultData list(@RequestBody BaseUnitModel model) {
        logger.debug("list BaseUnitModel:{}", model);

        return ResultDataFactory.getSuccess(unitService.listPage(model));

    }
}
