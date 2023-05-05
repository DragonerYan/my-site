package cn.luischen;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySiteApplicationTests {

	@Autowired
	private StringEncryptor stringEncryptor;

	@Test
	public void contextLoads() {
		String userName="root";
		String passWord="yxz09179012";
		String encryptStr = stringEncryptor.encrypt(userName);
		System.out.println("加密后的内容：" + encryptStr);

	}

}
