package edu.mum.cs.cs401.dataaccess;

/**
 * Created by 985333 on 9/13/2016.
 */
public interface DataAccess<K,V> {

     V add(K key, V value);
     V update(K key, V value);
     V delete(K key);
     V get(K key);
     int getValueSize();

}
