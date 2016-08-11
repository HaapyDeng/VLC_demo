package com.nmbb.vlc;

import android.app.Application;
import android.content.Context;

/**
 * Created by tangjun on 14-8-24.
 */
public class MyApplication extends Application {

	private static MyApplication sInstance;

	@Override
	public void onCreate() {
		super.onCreate();
		sInstance = this;
	}

	public static Context getAppContext() {
		return sInstance;
	}
}
