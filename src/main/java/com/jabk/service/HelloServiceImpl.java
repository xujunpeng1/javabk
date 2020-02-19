package com.jabk.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jabk.mapper.HelloMapper;
import com.jabk.pojo.User;
@Service
public class HelloServiceImpl implements HelloService {
	@Autowired
	private HelloMapper helloMapper;
	@Override
	public List<User> findAll() {
		return helloMapper.selectList(null);
	}

}
