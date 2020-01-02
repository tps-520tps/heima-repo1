package cn.itheima.user.manager.controller;


import cn.itheima.user.service.address.AddressService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserManagerController {
   //  客户端模拟服务降级处理  当超时2秒，不会抛出异常，而是进行服务降级处理
    @Reference(mock = "cn.itheima.user.service.address.AddressServiceMock",timeout = 2000)// 超时2秒  采用降级处理
    private AddressService addressService;

    @RequestMapping(value="findUserAddressById",produces = {"text/html;charset=utf-8"})
    public String findUserAddressById(String id){
        String userinfo = addressService.findUserAddressInfoById(id);
        return  userinfo;

    }
}
