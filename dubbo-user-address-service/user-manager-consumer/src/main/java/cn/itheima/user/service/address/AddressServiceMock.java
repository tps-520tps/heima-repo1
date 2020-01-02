package cn.itheima.user.service.address;

public class AddressServiceMock implements AddressService{

    @Override
    public String findUserAddressInfoById(String id) {
        System.out.println("服务阻塞---降级处理--");
        return "你好，当前页面访问火爆，请稍后再试！";
    }

    @Override
    public String findUserAddressByPhone(String phone) {
        return null;
    }
}
