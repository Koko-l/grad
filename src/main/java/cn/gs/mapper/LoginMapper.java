package cn.gs.mapper;

import cn.gs.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Repository
@Mapper
public interface LoginMapper extends BaseMapper<User> {
}