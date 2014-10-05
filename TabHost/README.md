Fragment实现TabHost效果
=========================

效果
====
![替代文本](http://fangjie-wordpress.stor.sinaapp.com/github/tabhost.jpg "效果")

讲解
===
布局方面：上面是ActionBar，中间的内容部分采用FragmentLayout，下面的4个Tab采用4个RadioButton的RadioGroup，通过修改样式达到效果。

将布局上的FragmentLayout替换为Fragment：
        fragmentManager = getSupportFragmentManager();      
        FragmentTransaction transaction = fragmentManager.beginTransaction(); 
        transaction.replace(R.id.content, (Fragment)fragment);  
        transaction.commit();  

关于切换Tab就是为RadioGroup设置选中改变监听器：
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {  
           public void onCheckedChanged(RadioGroup group, int checkedId) { 
          ｝
        ｝
