package org.example.proxyPattern.step4_javaProxy_protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setGeekRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        }catch (Exception ex){
            System.out.println("Caught an illegal arg execption.");
            System.out.println(ex.getMessage());
        }
        return null;// if any other method is called, we are basically blacklisting other method of non-interest.
    }
}
