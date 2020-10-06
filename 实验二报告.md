# java-
java课程作业项目仓库


# PC机模拟程序


## 实验目的 


1.熟悉java项目构成

2.熟悉并练习java项目建包，源程序编写

3.练习建立java源程序的类，练习属性及方法的编写

4.练习编写不同的构造方法

5.练习利用封装控制属性的访问权限

6.思考并实现源程序对其他private属性的调用

7.练习调试java程序，加深对java语法的理解

8.加深对java面向对象编程的理解


## 实验过程



### 实验实现内容：


  用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类
  
  
### 具体步骤：


  1.CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed
  
  2.HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount
  
  3.PC类要求setCPU(CPU c)将参数c的值赋值给cpu，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量
  
  4.主类Test的要求：
  
    （1） main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200； 
    
    （2） main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200； 
    
    （3） main方法中创建一个PC对象pc； 
    
    （4） pc调用setCPU(CPU c)方法，调用时实参是cpu； 
    
    （5） pc调用setHardDisk(HardDisk h)方法，调用时实参是disk；
    
    （6） pc调用show()方法；
    
    
### 拓展内容：


  1.类中定义不少于两个构造方法；
  
  2.每个类定义不少于2个属性，且属性的类型应该多样化；
  
  3.根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
  
  4.尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法；  
  


## 核心方法


### CPU.java:

```java
   public void setSpeed(int m) {
		  if(m>0) {
		  speed=m;
		  }
    }
    //用于设置speed值，将程序运行时赋给形参m的值赋给属性speed
    //并通过判断防止将不合理值赋给speed
```
```java
    public int getSpeed() {
		  return speed;
	  }	
    //用于返回当前的speed值，方便其他源程序调用被限制访问权限的speed
```

### HardDisk.java：

```java  
  void setAmount(int m){<br>
		  if(m>0) {<br>
			  amount=m;<br>
			}<br>
	  }<br>
    //用于设置amount值，将程序运行时赋给形参m的值赋给属性amount<br>
    //并通过判断防止将不合理值赋给amount<br>
```
```java
  int getAmount() {<br>
		  return amount;<br>
	  }<br>
    //用于返回当前的amount值，方便其他源程序调用被限制访问权限的amount<br>
```
    
### PC.java：<br>

```java
  void setCPU(CPU c) {<br>
		  cpu=c;<br>
	  }<br>
	  void setHardDisk(HardDisk h) {<br>
		  HD=h;<br>
    }<br>
    //用于给用构造方法构造的CPU HardDisk类型对象赋值<br>
```
```java
  void show() {<br>
		  m=cpu.getSpeed();<br>
		  n=HD.getAmount();
		  if(m!=0&n!=0) {
			  System.out.println("speed="+m+'\n'+"amount="+n);
	      }
		  else if(m==0&n!=0) {
			  System.out.println("cpu运行速度数据有误，请核实后再次输入");
		  }
		  else if(m!=0&n==0) {
			  System.out.println("硬盘存储数据有误，请核实后再次输入");
		  }
		  else {
			  System.out.println("cpu运行速度及硬盘存储数据有误，请核实后再次输入");
		  }
      //用于将对应对象内的属性输出到控制台
      //通过调用返回属性值的方法实现对private变量的调用
      //通过判断实现对用户输入数据合理性的反馈
  ```
      
### Test.java：

```java
  public static void main(String arg[]) {
		CPU cpu = new CPU();
		HardDisk disk =new HardDisk();
		PC pc = new PC();
		cpu.setSpeed(2200);
		disk.setAmount(200);
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	  }    
    //编写主方法作为程序运行入口，使项目正常运行
    //调用各源程序方法实现需求
```
    
## 实验结果


正常赋值程序截图：<br><br><br>

![%E5%9B%BE%E7%89%871.png](https://github.com/sans3174/java-/blob/sans3174.GitHub.io/image/%E5%9B%BE%E7%89%871.png)


cpu运行速度不合理赋值程序截图：<br><br><br>

![%E5%9B%BE%E7%89%872.png](https://github.com/sans3174/java-/blob/sans3174.GitHub.io/image/%E5%9B%BE%E7%89%872.png)


cpu运行速度及硬盘存储不合理赋值程序截图:<br><br><br>

![%E5%9B%BE%E7%89%873.png](https://github.com/sans3174/java-/blob/sans3174.GitHub.io/image/%E5%9B%BE%E7%89%873.png)


## 实验感想

通过本次实验，我第一次系统的编写了java源程序并放在项目于包中使其正常运行。<br>
熟悉并练习了类及属性与方法的编写，不同构造方法的编写，属性的访问权限的设置及其合理调用。<br>
练习了程序的查错调试。<br>
加深了对java面向对象编程的理解。<br>
