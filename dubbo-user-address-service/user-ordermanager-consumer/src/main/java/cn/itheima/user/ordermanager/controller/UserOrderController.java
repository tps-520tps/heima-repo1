package cn.itheima.user.ordermanager.controller;

import cn.itheima.user.service.address.AddressService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserOrderController {

    @Reference
    private AddressService addressService;

    @RequestMapping(value="findUserAddressById",produces = {"text/html;charset=utf-8"})
    public String findUserAddressById(String id){
        String userinfo = addressService.findUserAddressInfoById(id);
        return  userinfo;

    }


    @RequestMapping(value="findUserInfoByPhone",produces = {"text/html;charset=utf-8"})
    public String  findUserInfoByPhone(String phone){
        String info = addressService.findUserAddressByPhone(phone);
        return info;

    }
}
