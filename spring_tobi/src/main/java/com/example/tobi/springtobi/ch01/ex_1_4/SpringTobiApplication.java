package com.example.tobi.springtobi.ch01.ex_1_4;

import com.example.tobi.springtobi.ch01.ex_1_4.dao.DaoFactory;
import com.example.tobi.springtobi.ch01.ex_1_4.dao.UserDao;
import com.example.tobi.springtobi.ch01.ex_1_4.domain.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public class SpringTobiApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		setCharacter();

		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);



		UserDao dao = context.getBean("userDao",UserDao.class);

		User user = new User();
		user.setId("tobi6");
		user.setName("Tobi6");
		user.setPassword("123432");

		dao.add(user);

		System.out.println(user.getId() + " 등록성공!");

		User getUser = dao.get(user.getId());

		System.out.println(getUser.getName());
		System.out.println(getUser.getPassword());

		System.out.println(getUser.getId() + " 조회 성공");

	}

	private static void setCharacter() {
		try {
			System.setOut(new PrintStream(System.out, true, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}