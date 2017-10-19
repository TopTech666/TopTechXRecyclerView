package com.jcodecraeer.xrecyclerview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.jcodecraeer.xrecyclerview.progressindicator.AVLoadingIndicatorView;

import java.util.Date;

public class CWGJArrowRefreshHeader extends ArrowRefreshHeader {

    private int mState = STATE_NORMAL;

    public int mMeasuredHeight;

    public CWGJArrowRefreshHeader(Context context) {
        super(context);
        initView();
    }

    /**
     * @param context
     * @param attrs
     */
    public CWGJArrowRefreshHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public void initView() {
        super.initView();
//		// 初始情况，设置下拉刷新view高度为0
        mContainer = (LinearLayout) LayoutInflater.from(getContext()).inflate(
                R.layout.cwgj_listview_header, null);
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        lp.setMargins(0, 0, 0, 0);
        this.setLayoutParams(lp);
        this.setPadding(0, 0, 0, 0);
        removeAllViews();
        addView(mContainer, new LayoutParams(LayoutParams.MATCH_PARENT, 0));
        setGravity(Gravity.BOTTOM);
    }


    public void setState(int state) {
        if (state == mState) return;

        if (state == STATE_REFRESHING) {    // 显示进度
            Log.d("xlistview", "STATE_REFRESHING" + state);
            smoothScrollTo(mMeasuredHeight);
        } else if (state == STATE_DONE) {  // 已完成
            Log.d("xlistview", "STATE_DONE" + state);

        } else {    // 显示箭头图片
            Log.d("xlistview", "OTHER" + state);

        }

        switch (state) {
            case STATE_NORMAL:
                Log.d("xlistview", "STATE_NORMAL  " + state);

                if (mState == STATE_RELEASE_TO_REFRESH) {
                }
                if (mState == STATE_REFRESHING) {
                }
                break;
            case STATE_RELEASE_TO_REFRESH:
                Log.d("xlistview", "STATE_RELEASE_TO_REFRESH  " + state);

                if (mState != STATE_RELEASE_TO_REFRESH) {
                }
                break;
            case STATE_REFRESHING:

                break;
            default:
        }

        mState = state;
    }



}