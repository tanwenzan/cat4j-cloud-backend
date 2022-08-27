package cn.zeroable.cat4j.object;

public interface ObjectFactory<T extends Type> {
    T getObject(String type);
}
