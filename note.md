#Spring
##IOC
      IOC是控制反转,其中DI(依赖注入)是实现控制反转的一种方式
      IOC就是把对象生成的的权利由程序员反转给了用户.由用户来控制生成对象.
      
    ##常用依赖
        
        <dependency>
          <groupId>org.springframework</groupId>
            <artifactId>spring-test</artifactId>
            <version>5.3.1</version>
            <scope>test</scope>
        </dependency>
        
     ##注解说明
        
         @Component
         表示这个类被spring管理了
         a. 衍生的注解
             其中有几个衍生注解.在web开发中,会按照mvc三层架构分层!
             1.mapper      @Repository
             2.service     @Service
             3.controller  @Controller
             这四个注解功能是一样的.都是代表将某个类注册到Spring中.装配Bean
         b.自动装配的注解
             @Autowired:自动装配通过类型.名字
             如果@Atuowired不能唯一自动装配类型,则需要通过@Qualifier(value="xxx)
             如:
                <bean id="dog1" class="com.yang.pojo.Dog"></bean>
                <bean id="dog2" class="com.yang.pojo.Dog"></bean>
             通过@Autowired无法自动装配dog类 需要@Qualifier(value="dog1) 
             @Resource:自动装配通过名字.类型,  
         c. 作用域
            @Scope
                @Scope("singleton") //单例模式
                @Scope("prototype") //原型模式
         d.小结
            xml与注解:
                xml 相对来说更加万能.适用于任何场合!维护简单方便!
                注解.不是自己的类使用不了,维护相对复杂!
            xml 与注解最佳实践
                用xml创建beean.
                用注解的方式注入属性.
            我们在使用的过程中,只需要注意一个问题:必须让注解生效.就需要开启注解的支持.
               <context:component-scan base-package="com.yang"/>
               <context:annotation-config/>
            @Configuration
               这个也会被Spring容器托管.因为他本来就是一个@Component
               @Configuration代表这是一个配置类.就和我们之前看到的application.xml
               @ComponentScan表示扫描的包

##AOP
    ##为什么要学代理模式,因为这就是SpringAOP的底层![SpringAOP 和 SpringMVC]
    代理模式的分类:
        动态代理:
        静态代理:
##静态代理 
    代码步骤:
        1.接口
        //租房
        public interface   Rent {
            public void rent();
        }

        2.真实角色
        package com.yang.demo01;
        //房东
        public class Host implements Rent {
        
            public void rent() {
                System.out.println("房东要出租房子!");
            }
        }

        3.代理角色
        package com.yang.demo01;
        
        //中介.代理
        public class Proxy {
            private Host host;
        
            public Proxy(){
        
            }
        
            public Proxy(Host host) {
                this.host = host;
            }
            public void rent(){
                seeHouse();
                fare();
                hetong();
                host.rent();
        
            }
            //看房
            public void  seeHouse(){
                System.out.println("中介带看房子!");
            }
            //收中介费
            public void fare(){
                System.out.println("收中介费");
            }
            //签合同
            public void hetong(){
                System.out.println("签租赁合同");
            }
        
        }

        4.客户端访问代理角色
        package com.yang.demo01;
        //我要租房子
        public class Client {
            public static void main(String[] args) {
                //房东要出租
                Host host = new Host();
                //host.rent();
                //代理.代理了一些附属操作
                Proxy proxy = new Proxy(host);
                //你不需要面对房东,直接找中介即可!
                proxy.rent();
            }
        }

    静态代理模式的好处:
        可以使真实角色的操作更加纯粹.不用去关注一些公共的业务;
        公共也就是交给代理角色!实现了业务的分工!
        公共业务员发生扩展的时候,方便集中管理!
    静态代理的缺点:
        一个真实角色就会产生一个代理角色,代码量会翻倍.开发效率会变低
        
    例子在Spring-08-proxy demo01 02
    
##动态代理
    动态代理和静态代理角色一样
    动态代理的代理类是动态生成的,不是我们直接写好的!
    动态代理分为两大类:基于接口的动态代理,基于类的动态代理
        基于接口--JDK动态代理[我在这里使用的]
        基于类:cglib
        java字节码实现:javasist
    需要了解两个类
       Proxy:代理类
       方法:
       Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
       第一个参数是代理类生成的位置.
       第二个参数是具体代理的哪个接口;
       第三个参数是调用的处理程序
       
       invocationHandler :调用处理程序
         //处理代理实例.并返回结果
           public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               //动态代理的本质,就是使用反射机制实现!
               log(method.getName());
               Object result = method.invoke(target, args);
               return result;
           }
    动态代理的好处
        可以使真实角色的操作更加纯粹.不用去关注一些公共的业务;
        公共也就是交给代理角色!实现了业务的分工!
        公共业务员发生扩展的时候,方便集中管理!
        一个动态代理类代理的是一个接口,一般就是对应的一类业务
        一个动态代理类可以代理多个类.只要是实现了同一个接口即可