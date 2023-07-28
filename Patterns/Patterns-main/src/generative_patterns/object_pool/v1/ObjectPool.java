package generative_patterns.object_pool.v1;

import java.util.LinkedList;
import java.util.List;

/**
 * Пул хранения объектов, перемещает объекты между листами
 * в зависимости от их использования
 */
public class ObjectPool {
    private List<PooledObject> free = new LinkedList<>(); // Список свободных объектов
    private List<PooledObject> used = new LinkedList<>(); // Список используемых объектов

    /**
     * Метод получения объекта из пула
     * @return объект из пула
     */
    public PooledObject getPooledObject(){
        PooledObject pooledObject;
        if (free.isEmpty()){
            pooledObject = new PooledObject();
        }else{
            pooledObject = free.get(0);
            free.remove(pooledObject);
        }
        used.add(pooledObject);
        return pooledObject;
    }

    /**
     * Метод возвращения объекта в пул
     * @param pooledObject возвращаемый объект
     */
    public void releasePoolObject(PooledObject pooledObject){
        used.remove(pooledObject);
        free.add(pooledObject);
    }

}
