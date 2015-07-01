# android-bottom-tab-bar安卓底部导航栏
在iOS设计大行其道的日子里，安卓开发们必须做出一些折中和妥协，以满足大众审美需求，这个库由此诞生。这个库的目的很简单，就是模仿iOS当中的UITabBar，即一个导航栏。

这是本项目做出的简单效果：

<p align="center" >
  <img src="https://raw.github.com/AFNetworking/AFNetworking/assets/afnetworking-logo.png" alt="tabbar" title="tabbar">
</p>

#使用方式

- 将这段代码放到资源文件的根tag上：
```
xmlns:bottombar="http://schemas.android.com/apk/res-auto"
```
像这样：
```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:bottombar="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
```


- 然后将bottom bar放到项目的外观资源文件中：
```
<com.ysyao.bottomtabbar.BottomTextViewGroup
        android:layout_height="wrap_content"
        android:layout_width="match_parent"
        android:id="@+id/container"
        android:background="@color/bottom_bar_background"
        android:layout_alignParentBottom="true"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingBottom="@dimen/ui_margin_small">

    <com.ysyao.bottomtabbar.SelectableBottomTextView
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:id="@+id/bus"
        android:layout_weight="1"
        android:gravity="center"
        android:text="大巴"
        android:textSize="12sp"
        bottombar:selected_icon="@drawable/ic_bus_icon_selected"
        bottombar:unselected_icon="@drawable/ic_bus_icon_unselected"
        bottombar:text_selected_color="@color/button_textview_selected_color"
        bottombar:text_unselected_color="@color/button_textview_unselected_color"
        bottombar:default_selected="true"
        />

        <com.ysyao.bottomtabbar.SelectableBottomTextView
            android:id="@+id/bag"
            android:layout_weight="1"
            android:gravity="center"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:text="旅行团"
            android:textSize="12sp"
            bottombar:selected_icon="@drawable/ic_bag_selected"
            bottombar:unselected_icon="@drawable/ic_bag_unselected"
            bottombar:text_selected_color="@color/button_textview_selected_color"
            bottombar:text_unselected_color="@color/button_textview_unselected_color"
            bottombar:default_selected="false"
            />

        <com.ysyao.bottomtabbar.SelectableBottomTextView
            android:id="@+id/tourism"
            android:layout_weight="1"
            android:gravity="center"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            bottombar:selected_icon="@drawable/tour_selected"
            bottombar:unselected_icon="@drawable/tour_unselected"
            bottombar:text_selected_color="@color/button_textview_selected_color"
            bottombar:text_unselected_color="@color/button_textview_unselected_color"
            bottombar:default_selected="false"
            android:text="导游"
            android:textSize="12sp"
            />
    </com.ysyao.bottomtabbar.BottomTextViewGroup>
```

- tag属性解释：

```selected_icon``` ： 当tab选中的时候显示的图片。
```unselected_icon``` ： 当tab未选中的时候显示的图片。
```text_selected_color``` ： 当tab选中的时候文字显示的颜色。
```text_unselected_color``` ： 当tab未选中的时候文字显示的颜色。
```default_selected``` ： tab是否默认设定为选中状态。

- 注意：```BottomTextViewGroup```必须放在```BottomTextViewGroup``里面。



