package com.lawerly.rajatmareclbeck.lawerly.comman

import android.animation.AnimatorInflater
import android.content.Context
import android.os.Build
import android.support.v7.widget.CardView
import android.util.AttributeSet
import com.lawerly.rajatmareclbeck.lawerly.R


class ElevatedCardView : CardView {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val stateListAnimator = AnimatorInflater
                    .loadStateListAnimator(context, R.animator.elevation_on_touch)
            setStateListAnimator(stateListAnimator)
        }
    }
}