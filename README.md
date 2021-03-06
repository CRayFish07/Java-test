Java-test
===
- 以下为Java课程设计题目，题目命名格式与包名类名对应

# Excise1-2（GUI）

## test1_2_01
- 编写程序，使界面中包含三个标签，背景分别为红黄蓝三色。

## test1_2_02
- 编写程序界面中包含一个标签，一个文本框和一个按钮。当用户单击按钮时，程序把文
本框中的内容复制到标签中。

## test1_2_07
- 生成一个窗口响应鼠标事件，可以拖住鼠标在画布上画出蓝色的圆。鼠标按下和弹起的
位置为圆的直径。

## test1_2_10
- 实现一个计算器，界面包括 10 个数字按钮和 4 个运算符（+ - * /）按钮，以及等号和清
空两个辅助按钮。还有一个用于显示输入和输出的文本框。运算过程显示到文本框中。
可用 GridLayout 实现。

---
# Excise3-4（I/O）

## test3_4_01
- 写一个程序，接受用户的键盘输入，并把它写到文件中去。用户输入 exit 保存文件并退
出程序。

## test3_4_03
- 写一个程序来显示命令行指定目录中所有文件数目、目录数目、所有文件占用的空间大
小。

## test3_4_05
- 把 1~1000000 的数字写入文件中，一种方式以字符串的形式写入，另一种方式直接写入
数字的二进制表示，比较文件的大小。

## test3_4_06
- 以一下四种方式读取同一个大于 10M 的文件，1）直接使用 InputStream，按字节读，2）
直接使用 InputStream，按字节数组读（数组大小为 1024），3）使用缓冲流读入内存后
按字节读，4）使用缓冲流读入内存后按字节数组读，数组大小为 1024. 比较他们的执
行时间。

## test3_4_07
- 使用 GBK、UTF-8 等方式在文件中保存一段中文文字，并读出来，正确地打印到屏幕上。


---

# Excise5（Intnet）

## test_5_01
- 创建一个 URL 对象，完成如下要求：获取协议、主机名、端口号、文件路径。利用该 URL
的输入流读取资源文件并在控制台输出。

## test_5_02
- 使用 Socket 编写一个服务器端程序，监听 8888 端口，如果接收到客户端发来的 hello 请
求，回应一个 hello，其他请求不响应。

## test_5_03
- 编写程序，利用数据报（Datagram）查询端口占用情况。

## test_5_04
- 编写程序，利用数据包（Datagram）将一个文件从一台机器传到另一台机器上。

---

# Excise6-7（Thread）

## test_6_7_01
- 用 Thread 子类和 Runnable 实现类的方法编写多线程类，线程中循环 100 次，每次循环
中线程休眠 10 秒内的任意时间，休眠完成后打印出线程名称、休眠时间和第几次执行。

## test_6_7_02
- 系统随机生成 10000 个数，构造 5 个线程并利用它们的 Join 方法计算这些随机数的最大
值。

## test_6_7_05
- 你追我赶。在一个图形界面上构造两个位于同一起跑线方块，起跑线位于界面靠左位置，
A 方块先开始运动，向右移动 50 像素后停止，B 方块开始运动，向右移动 100 像素后停
止，A 方块继续向右运动 100 像素后停止，B 方块开始运动，如此循环接替执行，直至
某一个方块到达终点，界面显示该方块胜利信息。

## test_6_7_06
- 利用多线程、Socket 编程、GUI 编写一个聊天室，客户端可以发送信息，服务器将接收
到的每个用户端的信息实时发送给其他客户端。（提示：服务器端为每个客户端启动一
个单独线程，客户端启动一个单独线程接受服务器发送来的其他客户端的信息）。

## test_6_7_07
- 试用多线程的方法编写一个读写文件的程序，写时写入0~10000的整形数据（非字符串）
允许多个使用者同时读文件，一个使用者写文件，读写不能同时进行。（提示：设置一个
布尔对象标识读、写文件过程，写文件过程全程同步，读文件过程仅需对布尔对象操作
同步，利用线程协调机制 wait-notify 和布尔对象共同协调不能同时读写的过程）。

---
# 声明
> 如果你对该项目有什么想法或者建议，请联系我
> feiqishi@foxmail.com

