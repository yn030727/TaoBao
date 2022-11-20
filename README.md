# TaoBao
## 实现了大致的淘宝UI仿写
1.在BottomNavigationView上面搭建了五个简单的淘宝界面  
2.界面上的数据都是死数据，没有申请API，只是简单的页面仿写  
3.下面开始简单介绍各个界面，以及效果  
4.问题:第一次在一个完整的小demo中采用约束布局，大致部分都约束到了父布局上，可能下载下来，会出现，控件位置偏移，乃至重合的问题(对不同界面的适配？)
## 源代码导航  
1.com.example.taobao包下新建了两个包，第一包logic用来存放几个简单的界面上的数据，第二个包存放的是几个界面的UI相关的逻辑代码  
2. 命名格式: 五个界面分别为首页(Home)逛逛(Around)消息(Message)购物车(ShoppingCart)我的淘宝(MyTaoBao)  
- UI包下的逻辑代码都以对应的界面开头，后面跟对应的功能。 例如: TaobaoPerson_Activity(就是我的淘宝界面的个人主页)  
- logic包下同理。 例如:Home_commodity:首页的商品信息  
- 逻辑代码部分有三个页面不在包中。 MainActivity(加载BottomNavigationView) Welcome_Activity(欢迎界面) Unfinsh_Activity(部分控件点击后会跳转到这个施工页面)  
- layout布局文件下, 代码格式以layout_${其中一个界面英文名}_${功能} 形式划分。  例如: layout_message_search(就是消息界面的搜索框的布局)
- drawable-xxxhdpi资源文件下，代码格式以main_${其中一个界面英文名}_${具体是啥} 形式划分。 例如: main_message_head_dashu(就是信息界面底下聊天栏任务的头像)数据是死数据
## 我的淘宝
![img.png](open_image/taobao2.png)![img.png](open_image/taobao1.png)
![img.png](open_image/taobao3.png)![img.png](open_image/taobao4.png)
![img.png](open_image/taobao5.png)  
- 在NestScrollView中include各个分布局，实现了轮播广告，个人主页，退款售后，待付款..几个简单的界面
## 购物车
- 购物车界面是一个简单的RecyclerView
- 问题:还没有处理radioButton选中的问题  
- 优化:还可以改进选中该radioButton  
  
![img.png](open_image/shopping_cart1.png)
## 消息  
![img.png](open_image/message1.png)
![img.png](open_image/message2.png)
![img.png](open_image/mesage3.png)  
- 消息界面也是简单的NestScrollView嵌套RecyclerView，以及点击搜索框跳转到搜索界面。  
- 同时菜单栏上的menu点击后跳出来的是PopupWindow
## 逛逛  
- 当前界面是使用了ViewPager2和RecyclerView的方式构建
- 实现了悬浮栏上滑置顶，写了两个TabLayout，判断其滑动一定距离后，将另外一个TabLayout显示出来
- 问题:两个TabLayout只实现了选中同步，还没有实现位移同步
![img.png](open_image/Around1.png)
![img.png](open_image/Around2.png)  
## 首页
![img.png](open_image/home1.png)
## 总结
- 通过本次小demo的学习加强了对一些控件的熟悉  
- 学习了很多新的控件的用法(NavigationBottomView，轮播图，ViewPager2...)  -
- 加强了自己处理bug的能力  
- 为之后的团队项目打好基础