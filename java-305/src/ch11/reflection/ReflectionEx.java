package ch11.reflection;

import java.lang.reflect.*;

public class ReflectionEx {

	public static void main(String[] args) throws Exception {
		
		Class clazz = Class.forName("ch11.reflection.Car"); 
		
		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName());
		System.out.println();
		
		//�������� �̸��� �Ű����� ������ ���
		System.out.println("[������ ����]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName() +"(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		//�ʵ� Ÿ�԰� �ʵ� �̸� ���
		System.out.println("[�ʵ� ����]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		//�޼ҵ� �̸��� �Ű����� ���
		System.out.println("[�޼ҵ� ����]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
	}
	
	//�Ű� ���� ������ ����ϴ� ���� �ڵ�
	private static void printParameters(Class[] parameters) {
		for(int i = 0; i<parameters.length; i++) {
			System.out.println(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.println(",");
			}
		}
	}
}
