package main;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {

  Map<String, Flyweight> pool;

  public FlyweightFactory() {
    pool = new TreeMap<>();
  }

  public Map<String, Flyweight> getPool() {
    return pool;
  }

  public void setPool(Map<String, Flyweight> pool) {
    this.pool = pool;
  }

  public Flyweight getFlyweight(String key) {
    Flyweight flyweight = pool.get(key);

    if (flyweight == null) {
      flyweight = new Flyweight(key);
      pool.put(key, flyweight);
      System.out.println("created");
    } else {
      System.out.println("re-used");
    }

    return flyweight;
  }



}
