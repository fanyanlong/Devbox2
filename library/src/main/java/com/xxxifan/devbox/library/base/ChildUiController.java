package com.xxxifan.devbox.library.base;

import android.content.Context;
import android.view.View;

/**
 * Created by xifan on 15-12-28.
 * Fragment version of UiController.
 */
public abstract class ChildUiController implements BasePresenter {
    private View mView;
    private BaseFragment mFragment;

    public ChildUiController(BaseFragment fragment, View view) {
        if (fragment == null) {
            throw new IllegalArgumentException("fragment cannot be null");
        }
        if (view == null) {
            throw new IllegalArgumentException("view cannot be null");
        }
        mView = view;
        mFragment = fragment;
        initView(view);
    }

    public void onResume() {
    }

    public void onPause() {
    }

    public void onDestroy() {
        mView = null;
        mFragment = null;
    }

    public View getView() {
        return mView;
    }

    protected Context getContext() {
        return mView == null ? null : mView.getContext();
    }

    protected BaseFragment getFragment() {
        return mFragment;
    }

    protected abstract void initView(View view);
}
