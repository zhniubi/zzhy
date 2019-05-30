package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springcloud-server")
public interface UserService extends UserServiceApi {
}
