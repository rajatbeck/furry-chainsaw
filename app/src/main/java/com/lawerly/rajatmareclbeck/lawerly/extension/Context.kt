package com.lawerly.rajatmareclbeck.lawerly.extension

import android.content.Context
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.widget.Toast

inline fun Context?.toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
inline fun Context?.toast(@StringRes resId: Int) = Toast.makeText(this, this?.getString(resId), Toast.LENGTH_SHORT).show()
inline fun Context.longToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()
inline fun Context.longToast(@StringRes resId: Int) = Toast.makeText(this, getString(resId), Toast.LENGTH_LONG).show()

inline fun Fragment?.toast(message: String) = Toast.makeText(this?.context, message, Toast.LENGTH_SHORT).show()
inline fun Fragment?.toast(@StringRes resId: Int) = Toast.makeText(this?.context, this?.getString(resId), Toast.LENGTH_SHORT).show()
inline fun Fragment.longToast(message: String) = Toast.makeText(context, message, Toast.LENGTH_LONG).show()
inline fun Fragment.longToast(@StringRes resId: Int) = Toast.makeText(context, getString(resId), Toast.LENGTH_LONG).show()
