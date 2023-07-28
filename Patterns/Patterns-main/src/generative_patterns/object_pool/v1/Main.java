package generative_patterns.object_pool.v1;

public class Main {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject1 = objectPool.getPooledObject();
        System.out.println(pooledObject1.hashCode());
        objectPool.releasePoolObject(pooledObject1);

        PooledObject pooledObject2 = objectPool.getPooledObject();
        System.out.println(pooledObject2.hashCode());

    }
}
