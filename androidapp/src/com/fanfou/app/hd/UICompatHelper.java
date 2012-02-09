/*
 * Copyright 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fanfou.app.hd;

import com.fanfou.app.hd.ui.actionbarcompat.ActionBarHelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

/**
 * @author mcxiaoke
 * @version 1.0 2012.02.09
 *
 */
public class UICompatHelper
{
	
	private final ActionBarHelper mHelper;
	
	public static UICompatHelper newInstance(Activity activity){
		return new UICompatHelper(activity);
	}
	
	private UICompatHelper(Activity activity){
		this.mHelper=ActionBarHelper.createInstance(activity);
	}

	public void onCreate(Bundle savedInstanceState) {
		mHelper.onCreate(savedInstanceState);
	}

	public void onPostCreate(Bundle savedInstanceState) {
		mHelper.onPostCreate(savedInstanceState);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		return mHelper.onCreateOptionsMenu(menu);
	}

	protected void onTitleChanged(CharSequence title, int color) {
		mHelper.onTitleChanged(title, color);
	}

	public MenuInflater getMenuInflater(MenuInflater superMenuInflater) {
		return mHelper.getMenuInflater(superMenuInflater);
	}

	public void setRefreshActionItemState(boolean refreshing) {	
	}
}