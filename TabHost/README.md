## Fragment实现TabHost效果
## 1.效果
![TabHost](http://fangjie-wordpress.stor.sinaapp.com/github/tabhost.jpg "效果")
## 2.讲解

布局方面：上面是ActionBar，中间的内容部分采用FragmentLayout，下面的4个Tab采用4个RadioButton的RadioGroup，通过修改样式达到效果。

将布局上的FragmentLayout替换为Fragment：
```java
fragmentManager = getSupportFragmentManager();      
FragmentTransaction transaction = fragmentManager.beginTransaction(); 
transaction.replace(R.id.content, (Fragment)fragment);  
transaction.commit();  
```
关于切换Tab就是为RadioGroup设置选中改变监听器：
```java
radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {  
    public void onCheckedChanged(RadioGroup group, int checkedId) 
    { 
    ｝
｝
```
详细介绍：http://fangjie.info/?p=141

### 作者:by[@方杰_Jay](http://weibo.com/ncuitstudent) 