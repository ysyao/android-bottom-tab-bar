package com.ysyao.bottomtabbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class BottomTextViewGroup extends LinearLayout implements OnTextViewSelectedChanged,View.OnClickListener{
    public BottomTextViewGroup(Context context) {
        super(context);
        init();
    }

    public BottomTextViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init() {
        for(int i=0;i<getChildCount();i++) {
            View v = getChildAt(i);
            if(v instanceof SelectableBottomTextView) {
                SelectableBottomTextView selectableBottomTextView = (SelectableBottomTextView) v;
                selectableBottomTextView.setOnClickListener(this);
            }
        }
    }

    @Override
    public void onTextViewSelectedChanged(BottomTextViewGroup group, int selectedId) {
        for(int i=0;i<getChildCount();i++) {
            View v = getChildAt(i);
            if(v instanceof SelectableBottomTextView) {
                SelectableBottomTextView selectableBottomTextView = (SelectableBottomTextView) v;
                if(selectableBottomTextView.getId() != selectedId) {
                    selectableBottomTextView.setTextViewSelected(false);
                } else {
                    selectableBottomTextView.setTextViewSelected(true);
                }
            }
        }
    }

    @Override
    public void onClick(View view) {
        SelectableBottomTextView v = (SelectableBottomTextView)view;
        v.setTextViewSelected(true);
    }
}