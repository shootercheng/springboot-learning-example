package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengdu
 * @date 2019/6/5.
 */

@RestController
public class CityController {

    @Autowired
    private CityDubboConsumerService cityDubboConsumerService;

    @RequestMapping("/dubbodata")
    public City getDubboData(String cityName){
        return cityDubboConsumerService.getCity(cityName);
    }
}
