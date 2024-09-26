package com.example.tobi.springtobi.ch05.ex_5_2;

<<<<<<< HEAD
import com.example.tobi.springtobi.ch05.ex_5_1.dao.DaoFactory;
import com.example.tobi.springtobi.ch05.ex_5_1.dao.UserDaoJdbc;
=======
import com.example.tobi.springtobi.ch05.ex_5_2.dao.DaoFactory;
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public class SpringTobiApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		setCharacter();
<<<<<<< HEAD

		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDaoJdbc userDao = context.getBean("userDao", UserDaoJdbc.class);

		int count = userDao.getCount();
		System.out.println(count);

		userDao.deleteAll();

		count = userDao.getCount();
		System.out.println(count);

=======
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9

	}

	private static void setCharacter() {
		try {
			System.setOut(new PrintStream(System.out, true, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}