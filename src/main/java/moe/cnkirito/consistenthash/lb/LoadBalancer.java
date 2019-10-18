package moe.cnkirito.consistenthash.lb;

import java.util.List;
import moe.cnkirito.consistenthash.Invocation;
import moe.cnkirito.consistenthash.Server;

/**
 * @author daofeng.xjf
 * @date 2019/2/16
 */
public interface LoadBalancer {

    Server select(List<Server> servers, Invocation invocation);
}
