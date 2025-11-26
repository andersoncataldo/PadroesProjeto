package POA;

import java.lang.reflect.Proxy;

class AspectFactory {

    @SuppressWarnings("unchecked")
    public static <T> T criarProxy(T objeto, Class<T> interfaceClass) {
        return (T) Proxy.newProxyInstance(
                interfaceClass.getClassLoader(),
                new Class<?>[] { interfaceClass },
                new AspectHandler(objeto)
        );
    }
}