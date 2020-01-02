package cn.itheima.user.service.address;

public interface AddressService {


    /**
     * 用户管理相关服务协议
     */

    // 根据用户id 查询用户的列表查询
    public  String  findUserAddressInfoById(String id);


    //  根据用户手机号查询用户地址信息

    public String  findUserAddressByPhone(String phone);


}
