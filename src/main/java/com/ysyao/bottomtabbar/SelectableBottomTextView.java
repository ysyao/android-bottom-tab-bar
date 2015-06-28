package com.ysyao.bottomtabbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;

public class SelectableBottomTextView extends TextView implements View.OnClickListener{
    private boolean selectedDefault = false;
    private int selectedColor;
    private int unselectedColor;
    private Drawable selectedIcon;
    private  Drawable unselectedIcon;
    private OnSelectableTextViewClickedListener listener;

    public SelectableBottomTextView(Context context) {
        super(context);
    }

    public SelectableBottomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.SelectableView);

        selectedColor = a.getColor(R.styleable.SelectableView_text_selected_color, android.R.color.holo_blue_dark);
        unselectedColor = a.getColor(R.styleable.SelectableView_text_unselected_color, android.R.color.black);
        selectedDefault = a.getBoolean(R.styleable.SelectableView_default_selected, selectedDefault);
        selectedIcon = a.getDrawable(R.styleable.SelectableView_selected_icon);
        unselectedIcon = a.getDrawable(R.styleable.SelectableView_unselected_icon);

        setTextViewSelected(selectedDefault);
        setOnClickListener(this);
        a.recycle();
    }

    public void setTextViewSelected(boolean isSelected) {
        this.selectedDefault = isSelected;
        setTextViewSelected();
    }

    public void setOnTextViewClickedListener( OnSelectableTextViewClickedListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        ViewParent parent = getParent();
        if(parent instanceof  BottomTextViewGroup) {
            BottomTextViewGroup group = (BottomTextViewGroup)parent;
            group.onTextViewSelectedChanged(group, getId());
        }
        if(listener != null) {
            listener.onTextViewClicked(view);
        }
    }

    private void setTextViewSelected() {
        if(selectedDefault) {
            setTextColor(selectedColor);
            setCompoundDrawablesWithIntrinsicBounds(null, selectedIcon, null, null);
        } else {
            setTextColor(unselectedColor);
            setCompoundDrawablesWithIntrinsicBounds(null, unselectedIcon, null, null);
        }
    }
}