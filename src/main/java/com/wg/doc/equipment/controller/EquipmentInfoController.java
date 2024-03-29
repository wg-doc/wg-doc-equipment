package com.wg.doc.equipment.controller;


import com.wg.doc.base.result.Result;
import com.wg.doc.equipment.entity.EquipmentInfo;
import com.wg.doc.equipment.service.EquipmentInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "EQUIPMENT_INFO", tags = { "EQUIPMENT_INFO" })
@RestController
@RequestMapping("/equipment")
public class EquipmentInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EquipmentInfoController.class);

    @Autowired
    private EquipmentInfoService equipmentInfoService;

    @GetMapping("/{id}")
    @ApiOperation(value="info", notes="info")
    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "id", required = true)
    public Result<EquipmentInfo> getCustomerByAge(@PathVariable long id) {
        return Result.success(equipmentInfoService.getEquipment(id));
    }

}
