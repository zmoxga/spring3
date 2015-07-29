package com.jason.spring.bean.scope.thread;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class ThreadScope implements Scope {

  private final ThreadLocal<Map<String, Object>> THREAD_SCOPE = new ThreadLocal<Map<String, Object>>() {
    protected Map<String, Object> initialValue() {
      return new HashMap<String, Object>();
    }
  };

  @Override
  public Object get(String name, ObjectFactory<?> objectFactory) {
    if (THREAD_SCOPE.get().containsKey(name)) {
      return THREAD_SCOPE.get().get(name);
    }
    THREAD_SCOPE.get().put(name, objectFactory.getObject());
    return THREAD_SCOPE.get().get(name);
  }

  @Override
  public Object remove(String s) {
    return THREAD_SCOPE.get().remove(s);
  }

  @Override
  public void registerDestructionCallback(String s, Runnable runnable) {

  }

  @Override
  public Object resolveContextualObject(String s) {
    return null;
  }

  @Override
  public String getConversationId() {
    return null;
  }
}
