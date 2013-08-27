package com.shashank.smartrail.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import com.shashank.smartrail.R;

/**
 * The Class TextViewPlus.
 * 
 * Sub class of TextView for setting up the custom Typeface.
 * 
 * @author Shashank Kushwah
 */
public class TextViewPlus extends TextView {

	/** The Constant TAG. */
	private static final String TAG = "TextView";

	/**
	 * Instantiates a new text view plus.
	 * 
	 * @param context
	 *            the context
	 */
	public TextViewPlus(Context context) {
		super(context);
	}

	/**
	 * Instantiates a new text view plus.
	 * 
	 * @param context
	 *            the context
	 * @param attrs
	 *            the attrs
	 */
	public TextViewPlus(Context context, AttributeSet attrs) {
		super(context, attrs);
		setCustomFont(context, attrs);
	}

	/**
	 * Instantiates a new text view plus.
	 * 
	 * @param context
	 *            the context
	 * @param attrs
	 *            the attrs
	 * @param defStyle
	 *            the def style
	 */
	public TextViewPlus(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setCustomFont(context, attrs);
	}

	/**
	 * Sets the custom font.
	 * 
	 * @param ctx
	 *            the ctx
	 * @param attrs
	 *            the attrs
	 */
	private void setCustomFont(Context ctx, AttributeSet attrs) {
		TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.FontPlus);
		String customFont = a.getString(R.styleable.FontPlus_customFont);
		setCustomFont(ctx, customFont);
		a.recycle();
	}

	/**
	 * Sets the custom font.
	 * 
	 * @param ctx
	 *            the ctx
	 * @param asset
	 *            the asset
	 * @return true, if successful
	 */
	public boolean setCustomFont(Context ctx, String asset) {
		Typeface tf = null;
		asset = "fonts/" + asset;
		try {
			tf = Typeface.createFromAsset(ctx.getAssets(), asset);
		} catch (Exception e) {
			Log.e(TAG, "Could not get typeface: " + e.getMessage());
			return false;
		}

		setTypeface(tf);
		return true;
	}

}