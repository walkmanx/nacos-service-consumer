package com.zy.cloud.nacos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>Title: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Version:zhuoyuan V2.0</p>
 *
 * @author gc
 * @description
 * @date 2021/6/23 下午 14:50
 */
@FeignClient(value="nacos-service-provider")
public interface ServiceApi {

    @GetMapping("/echo/{str}")
    String echo(@PathVariable String str);

}
