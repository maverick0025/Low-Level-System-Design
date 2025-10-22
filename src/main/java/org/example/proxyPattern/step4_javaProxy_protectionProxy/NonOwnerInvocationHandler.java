package org.example.proxyPattern.step4_javaProxy_protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setGeekRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        }catch (Exception ex){
            System.out.println("Bad access. You cheeky!");
            ex.getMessage();
        }

        return null;
    }
}
