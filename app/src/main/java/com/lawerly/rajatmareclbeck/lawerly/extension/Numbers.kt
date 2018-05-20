package com.lawerly.rajatmareclbeck.lawerly.extension

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue


fun Number.toPx(context: Context): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), context.resources.displayMetrics).toInt()
}
fun Number.toDp(context: Context): Float = this.toFloat() / (context.resources.displayMetrics.densityDpi / 160f)

val Number.px: Int get() = (this.toDouble() * Resources.getSystem().displayMetrics.density).toInt()
val Number.dp: Float get() = (this.toDouble() / Resources.getSystem().displayMetrics.density).toFloat()

fun Boolean.toInt() = if (this) 1 else 0

fun Int.clamp(min: Int, max: Int) = Math.min(max, Math.max(min, this))

fun Number.format(format: String) = format.format(this)