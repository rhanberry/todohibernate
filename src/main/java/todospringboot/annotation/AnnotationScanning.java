package todospringboot.annotation;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.reflections.Reflections;

import todospringboot.annotation.CustomAnnotation;


public class AnnotationScanning {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
	IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Reflections.log = null;

		Reflections reflections = new Reflections("todospringboot");
		Set<Class<?>> matchingClasses = reflections.getTypesAnnotatedWith(CustomAnnotation.class);
		for (Class<?> match : matchingClasses) { 
			CustomAnnotation annotation = match.getAnnotation(CustomAnnotation.class);
			Integer count = annotation.count();
			Object o = match.newInstance();
			for (int i = 0; i < count; i++) {
				match.getMethod("start").invoke(o);
			}
		}

	}

}
