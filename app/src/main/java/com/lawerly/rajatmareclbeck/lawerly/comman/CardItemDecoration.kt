package com.lawerly.rajatmareclbeck.lawerly.comman

import android.content.Context
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View
import com.lawerly.rajatmareclbeck.lawerly.extension.toPx

class CardItemDecoration(
        val context: Context,
        val orientation: Orientation = Orientation.Vertical,
        scrollDirectionPadding: Int = 8,
        scrollCrossDirectionPadding: Int = 8
) : RecyclerView.ItemDecoration() {

    enum class Orientation { Horizontal, Vertical }

    private val scrollDirectionPadding: Int = scrollDirectionPadding.toPx(context)
    private val scrollCrossDirectionPadding: Int = scrollCrossDirectionPadding.toPx(context)

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val pos = parent.getChildViewHolder(view).adapterPosition
        val first = pos == 0
        val last = pos == parent.adapter.itemCount
        if (orientation == Orientation.Horizontal) {
            outRect.top = scrollCrossDirectionPadding
            outRect.bottom = scrollCrossDirectionPadding
            outRect.left = if (first) scrollDirectionPadding else scrollDirectionPadding / 2
            outRect.right = if (last) scrollDirectionPadding else scrollDirectionPadding / 2
        } else {
            outRect.top = if (first) 0 else scrollDirectionPadding / 2
            outRect.bottom = if (last) scrollDirectionPadding else scrollDirectionPadding / 2
            outRect.left = if(first) 0 else scrollCrossDirectionPadding
            outRect.right = if(first) 0 else scrollCrossDirectionPadding
        }
    }

}