package com.zac.Tricking1sic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zac.Tricking1sic.vo.TestVo;

@Repository
@Mapper
public interface TestMapper {
	List<TestVo> selectTest();
}
