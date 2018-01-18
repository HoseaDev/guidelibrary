package com.yuyh.library.bean;

import android.graphics.RectF;
import android.view.View;

import com.yuyh.library.support.HShape;

/**
 * 高亮区域显示
 *
 * @author yuyh.
 * @date 2016/12/24.
 */
public class HighlightArea {

    public View mHightlightView;
    private int paddingTop;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;

    @HShape
    public int mShape;

    public HighlightArea(View view, @HShape int shape) {
        this.mHightlightView = view;
        this.mShape = shape;
        paddingTop = 8;
        paddingBottom = 8;
        paddingLeft = 8;
        paddingRight = 8;
    }

    public HighlightArea(View mHightlightView, int paddingTop, int paddingBottom, int paddingLeft, int paddingRight, int mShape) {
        this.mHightlightView = mHightlightView;
        this.paddingTop = paddingTop;
        this.paddingBottom = paddingBottom;
        this.paddingLeft = paddingLeft;
        this.paddingRight = paddingRight;
        this.mShape = mShape;
    }

    public RectF getRectF() {
        RectF rectF = new RectF();
        if (mHightlightView != null) {
            int[] location = new int[2];
            mHightlightView.getLocationOnScreen(location);
            rectF.left = location[0] - paddingLeft;
            rectF.top = location[1] - paddingTop;
            rectF.right = location[0] + mHightlightView.getWidth() + paddingRight;
            rectF.bottom = location[1] + mHightlightView.getHeight() + paddingBottom;
        }
        return rectF;
    }
}
