package cn.edu.xmu.mapper;

import cn.edu.xmu.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther NieBin
 * @create 2020-05-28 19:55
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_creat,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreat},#{gmtModified})")
    void insert(User user);
}
