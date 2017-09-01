package ssm;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.ssm.pojo.User;
import com.cn.ssm.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:META-INF/spring/spring-mybatis.xml"})
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	@Resource
	private IUserService userSevice = null;
	
	@Test
	public void test1() {
		User user = userSevice.getUserById(1);
		System.out.println(JSON.toJSONString(user));
		logger.info(JSON.toJSONString(user));
	}
	
	@Test
	public void test2() {
		BigDecimal b = new BigDecimal("100.0000");
		System.out.println(b.toString());
		System.out.println(b.intValue());
		
	}
	

}
