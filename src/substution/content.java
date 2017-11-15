package substution;

/**
 * Created by yifanyang on 2017/11/9.
 */
public class content {
    int id;//页面号
    int count;//属于第几老的页面
    public void setCount(int count)
    {
        this.count=count;
    }
    public content(int id,int count)
    {
        this.id=id;
        this.count=count;
    }
}
