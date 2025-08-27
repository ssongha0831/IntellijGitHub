// 송하연
package TestQuiz.Weekely04;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String value();
    boolean skipYn() default false;
}

class Person {
    @JsonField(value = "full_name")
    private String name = "John Doe";

    @JsonField(value = "age")
    private int age = 30;

    @JsonField(value = "age", skipYn = true)
    private String gender = "M";
}

public class JavaStudySelection04_01 {

    public static String toJson(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);

                if (annotation.skipYn()) {
                    continue;
                }

                field.setAccessible(true);
                try {
                    Object value = field.get(obj);
                    if (!first) {
                        sb.append(",");
                    }
                    sb.append(annotation.value());
                    sb.append(": ");

                    if (value instanceof String) {
                        sb.append("\"").append(value).append("\"");
                    } else {
                        sb.append(value);
                    }

                    first = false;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        Person p = new Person();
        String json = toJson(p);
        System.out.println(json);
    }
}
