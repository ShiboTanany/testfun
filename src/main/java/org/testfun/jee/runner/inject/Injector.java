package org.testfun.jee.runner.inject;

import java.lang.reflect.Field;

public interface Injector {
    <T> void inject(T target, Field field);
    void reset();
}
