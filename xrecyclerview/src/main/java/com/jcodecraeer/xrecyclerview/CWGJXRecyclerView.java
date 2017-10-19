package com.jcodecraeer.xrecyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import java.util.ArrayList;
import java.util.List;

public class CWGJXRecyclerView extends XRecyclerView {

    public CWGJXRecyclerView(Context context) {
        super(context);
    }

    public CWGJXRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CWGJXRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void init() {
        super.init();
        if (pullRefreshEnabled) {
            mRefreshHeader = new CWGJArrowRefreshHeader(getContext());
        }
    }
}