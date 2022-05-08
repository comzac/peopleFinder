package com.zac.Tricking1sic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zac.Tricking1sic.mapper.TestMapper;
import com.zac.Tricking1sic.vo.TestVo;

@Service
public class TestService {
	@Autowired
	public TestMapper mapper;

	public List<TestVo> selectTest() {
		return mapper.selectTest();
	}
}
