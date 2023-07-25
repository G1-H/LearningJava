package mission.week3.day1_mission2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class SingletonContext {

    private static SingletonConfig config;
    private static Map<String, Method> singletonMap = new HashMap<>();
    private static Map<String, Object> singletonObjectMap = new HashMap<>();

    public static void setConfig(SingletonConfig config) {
        SingletonContext.config = config;
    }

    static synchronized Object getSingleton(String name) throws InvocationTargetException, IllegalAccessException {
        // 아래 구문 삭제 후, Map을 이용한 Singleton 생성 로직 구현 필요합니다.
        Object singletonObject = singletonObjectMap.get(name);
        if (singletonObject == null) {
            singletonObject = singletonMap.get(name).invoke(config);
            singletonObjectMap.put(name, singletonObject);
        }
        return singletonObject;
    }

    public static void executeMethodsBySingletonAnnotation(Object object) {
        //  Object 가 들어 오면 해당 클래스의 Method를 돌면서, @Singleton annotation을 발견합니다.
        Class clazz = object.getClass();
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Singleton) {
                    // 해당 Annotation의 name 과 method를 적당한 Map에 저장합니다.
                    String singletonName = ((Singleton) annotation).name();
                    singletonMap.put(singletonName, method);
                }
            }


        }




    }

}
