package cn.itheima.user.service.address.impl;

import cn.itheima.user.service.address.AddressService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 *   服务发布者：  提供服务的具体实现  - 模拟数据库  所以直接返回字符数据
 */
@Service(timeout = 5000)  // 请求服务端5秒内 不会抛出异常
public class AddressServiceImpl implements AddressService{
    @Override
    public String findUserAddressInfoById(String id) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "你好 该用户的地址是：xxxx大街200号101  用户id = "+id;
    }

    @Override
    public String findUserAddressByPhone(String phone) {
        return "你好 该用户的地址是：xxxx大街202号102  用户电话 = "+phone;
    }
}
