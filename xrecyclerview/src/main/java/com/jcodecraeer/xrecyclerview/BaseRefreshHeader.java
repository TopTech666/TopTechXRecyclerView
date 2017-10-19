package com.jcodecraeer.xrecyclerview;

/**
 * Created by jianghejie on 15/11/22.
 */
interface BaseRefreshHeader {

	int STATE_NORMAL = 0;   //正常状态
	int STATE_RELEASE_TO_REFRESH = 1; // 下拉，未放开
	int STATE_REFRESHING = 2; // 下拉，未放开
	int STATE_DONE = 3; //下拉完成

	void onMove(float delta);

	boolean releaseAction();

	void refreshComplete();

}