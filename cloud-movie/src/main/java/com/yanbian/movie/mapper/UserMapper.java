package com.yanbian.movie.mapper;

import com.yanbian.movie.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
	/**
	 * 查询所有图书
	 * @return
	 */
	@Select("SELECT * FROM d_user WHERE id=#{id}")
	User findBookByid(@Param("id") int id);
}
