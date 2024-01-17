# SpringBoot + SpringSecurity + JWT

About this repo:

This is my personal backend repo using SpringBoot + SpringSecurity + Mybatis-plus + JWT + Redis(as cache) + RabbitMQ(dealing with message queue).

You can start the backend directly in IntelliJ IDEA. But before that, please set the Environment variable as follow:

```shell
SPRING_AMQP_DESERIALIZATION_TRUST_ALL=true
```

Then, in order to start the backend, you need to start MySQL, Redis and RabbitMQ in your local machine. You can download them from the official website or use the docker image. I use the docker image in my local machine.  
<img src="https://image.itbaima.cn/images/630/image-20240118019215506.png" alt="Docker containers"/>

Then you are all set and good to go!
