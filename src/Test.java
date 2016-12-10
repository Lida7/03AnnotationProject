import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test {

	public static void main(String[] args) {
		System.out.println(Human.class.getAnnotation(CustomerAnnotation.class));
	}
	
	
	/**
	 * 
	 * //Retention  
	 * RetentionPolicy.RUNTIME ��������ʱ�ɼ�
	 * RetentionPolicy.CLASS ������class��JVM����ʱ���ᱣ��ע��
	 * RetentionPolicy.SOURCE �༭��ֱ�Ӷ������ֲ��Ե�ע��
	 * 
	 *	//Target
	 *  ����ָ��ע��ʹ�õķ�Χ ���Բ�д
	 *
	 */
	//@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface CustomerAnnotation {
		String fieldStr();
		int fieldInt();
		String field() default "test";//Ĭ��ֵ
	}
	
	@CustomerAnnotation(fieldStr="Test",fieldInt=100)
	public class Human{
		
	}
}
