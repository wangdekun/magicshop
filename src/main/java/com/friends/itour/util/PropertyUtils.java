package com.friends.itour.util;

import java.lang.reflect.InvocationTargetException;

public class PropertyUtils {
    public static void copyProperties(Object dest, Object orig){
        try {
            org.apache.commons.beanutils.PropertyUtils.copyProperties(dest,orig);//PropertyUtils复制对象
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
