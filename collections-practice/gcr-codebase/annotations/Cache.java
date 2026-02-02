import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.HashMap;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}
public class Cache{
    static HashMap<Integer, Integer> cache = new HashMap<>();
    @CacheResult
    public int square(int x){
        System.out.println("Computing");
        return x*x;
    }
    public static void main(String[] args) throws Exception{
        Cache obj=new Cache();
        Method method=obj.getClass().getDeclaredMethod("square", int.class);
        int input=5;
        if (method.isAnnotationPresent(CacheResult.class)){
            if (cache.containsKey(input)){
                System.out.println("From Cache: "+cache.get(input));
            } else{
                int result=(int) method.invoke(obj,input);
                cache.put(input, result);
                System.out.println("Computed: "+result);
            }
        }
    }
}
