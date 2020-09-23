import com.cjp.layui.dto.Person;
import com.cjp.layui.dto.StuInvocationHandler;
import com.cjp.layui.dto.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class StaticProxyTest {
    public static void main(String[] args) {
       /* //被代理的学生张三，他的班费上交有代理对象monitor（班长）完成
        Person zhangsan = new Student("张三");
        Student xiaohong = new Student("小红");

        //生成代理对象，并将张三传给代理对象
        Person monitor = new StudentsProxy(zhangsan);
        StudentsProxy studentsProxy = new StudentsProxy(xiaohong);

        //班长代理上交班费
        monitor.giveMoney();
        studentsProxy.giveMoney();*/
        Student xiaoming = new Student("小明");
        InvocationHandler invocationHandler = new StuInvocationHandler<Person>(xiaoming);
        Person proxyInstance = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, invocationHandler);
        proxyInstance.giveMoney();
    }
}