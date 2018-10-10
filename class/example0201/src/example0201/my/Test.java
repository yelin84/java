package example0201.my;

import af.AfConsole;

public class Test
{

	public static void main(String[] args)
	{
		Student s = new Student(201801, "邵发", "18800012345");
		//System.out.println("学生信息:" + s.toString());
		AfConsole a = new AfConsole();
		a.println("请输入用户名：");
		String usename = a.readString("");
		a.println("请输入密码：");
		String passwd = a.readString("");
		
		System.out.println("用户名:" + usename + "\n" + "密码：" + passwd);
		

	}

}
