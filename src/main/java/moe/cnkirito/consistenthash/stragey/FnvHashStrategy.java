package moe.cnkirito.consistenthash.stragey;

/**
 * @author daofeng.xjf
 * @date 2019/2/16
 * <p>
 * FNV1_32_HASH 算法
 */
public class FnvHashStrategy implements HashStrategy {

    private static final long FNV_32_INIT = 2166136261L;
    private static final int FNV_32_PRIME = 16777619;

    @Override
    public int getHashCode(String origin) {
        final int p = FNV_32_PRIME;
        int hash = (int) FNV_32_INIT;
        for (int i = 0; i < origin.length(); i++)
            hash = (hash ^ origin.charAt(i)) * p;
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;
        hash = Math.abs(hash);
        return hash;
    }
}
