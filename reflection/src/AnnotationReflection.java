import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationReflection {

    public static void main(String[] args) {

        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();

        Field[] fields = personClass.getDeclaredFields();

        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(MyFirstAnnotation.class)){

                }
            }

        }


    }
}
