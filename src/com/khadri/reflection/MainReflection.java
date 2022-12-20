package com.khadri.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainReflection {

	public static void main(String[] args) throws Exception {

		// Loading a class in the reflection way
		Class<?> classObject = Class.forName("com.khadri.reflection.Customer");

		// Getting all constructors of Class class object(Customer)
		Constructor<?>[] constructors = classObject.getConstructors();

		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}

		// Getting all methods of Class class object(Customer)
		Method[] declaredMethods = classObject.getDeclaredMethods();

		for (Method method : declaredMethods) {
			System.out.println(method);
		}

		// invoke a method of customer using reflection way
		Customer newInstance = (Customer) classObject.getDeclaredConstructor().newInstance();
		newInstance.orderService();

	}
}
