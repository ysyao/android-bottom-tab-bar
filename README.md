# android-bottom-tab-bar安卓底部导航栏
在iOS设计大行其道的日子里，安卓开发们必须做出一些折中和妥协，以满足大众审美需求，这个库由此诞生。这个库的目的很简单，就是模仿iOS当中的UITabBar，即一个导航栏。

这是利用本项目做出的简单效果：

#使用方式

将这段代码放到项目的外观资源文件中：
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
注意：在调用这段代码之前需要在根view的tag加上：
```
xmlns:bottombar="http://schemas.android.com/apk/res-auto"
```


