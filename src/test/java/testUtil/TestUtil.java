package testUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.pro.bean.Clazz;
import com.pro.bean.Student;
import com.pro.util.ProtoBufUtil;

public class TestUtil {

	Student student;

	@Before
	public void setUp() throws Exception {
		student = new Student();
		student.setName("lance");
		student.setAge(28);
		student.setStudentNo("2011070122");
		student.setSchoolName("BJUT");
		List<Clazz> cla = new ArrayList<Clazz>();
		cla.add(new Clazz("1", "redis"));
//		cla.add(new Clazz("2", "mongodb"));
		cla.add(new Clazz("3", "memcache"));
		cla.add(new Clazz("5", "hbase"));
		
		System.out.println("cla " + cla);
		
		student.setClazz(cla);
		student.setCla(new Clazz("4", "mybatis"));
	}

	@Test
	public void test() {
		
		//序列化
		byte[] serializerResult = ProtoBufUtil.serializer(student);

		System.out.println("serializer result:" + Arrays.toString(serializerResult));

		//反序列化
		Student deSerializerResult = ProtoBufUtil.deserializer(serializerResult, Student.class);

		System.out.println("deSerializerResult:" + deSerializerResult.toString());

	}
}
