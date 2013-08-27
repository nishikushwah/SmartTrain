package com.shashank.smartrail.activities;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.shashank.smartrail.R;

/**
 * The Class SmartTrainFragmentActivity.
 * 
 * @author Shashank Kushwah
 */
public class SmartTrainFragmentActivity extends SherlockFragmentActivity {

	/** The m title res. */
	private int mTitleRes;

	/** The m title view. */
	private View mTitleView;

	/**
	 * Instantiates a new SmartTrain fragment activity.
	 * 
	 * @param titleRes
	 *            string resource id to set the title in the ActionBar. *
	 */
	public SmartTrainFragmentActivity(int titleRes) {
		mTitleRes = titleRes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String title = getString(mTitleRes);
		if (title.length() > 0) {
			// Inflate the custom view in action bar
			mTitleView = LayoutInflater.from(this).inflate(
					R.layout.actionbar_title, null);
			TextView titleTextView = (TextView) mTitleView
					.findViewById(R.id.titleTextView);
			titleTextView.setText(" " + title + " ");

			ActionBar.LayoutParams lp = new ActionBar.LayoutParams(
					LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
			lp.gravity = Gravity.LEFT | Gravity.CENTER_VERTICAL;
			mTitleView.setLayoutParams(lp);

			getSupportActionBar().setCustomView(mTitleView);
			getSupportActionBar().setDisplayShowCustomEnabled(true);
			getSupportActionBar().setDisplayShowTitleEnabled(false);
		}

	}

	/**
	 * sets the title of the ActionBar.
	 * 
	 * @param title
	 *            string for setting the title of the ActionBar.
	 */
	public void setABTitle(String title) {
		if (mTitleView != null) {
			((TextView) mTitleView.findViewById(R.id.titleTextView))
					.setText(title);
		}
	}
}
