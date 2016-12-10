import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test {

	public static void main(String[] args) {
		System.out.println(Human.class.getAnnotation(CustomerAnnotation.class));
	}
	
	
	/**
	 * 
	 * //Retention  
	 * RetentionPolicy.RUNTIME 配置运行时可见
	 * RetentionPolicy.CLASS 保留在class，JVM运行时不会保留注释
	 * RetentionPolicy.SOURCE 编辑器直接丢弃这种策略的注释
	 * 
	 *	//Target
	 *  用于指定注解使用的范围 可以不写
	 *
	 */
	//@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface CustomerAnnotation {
		String fieldStr();
		int fieldInt();
		String field() default "test";//默认值
	}
	
	@CustomerAnnotation(fieldStr="Test",fieldInt=100)
	public class Human{
		
	}
}
