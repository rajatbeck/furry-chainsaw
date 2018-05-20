package com.lawerly.rajatmareclbeck.lawerly.comman

import android.support.v7.widget.RecyclerView
import android.view.View

open class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    open val dataPosition: Int = adapterPosition
    open fun bind() {}
    open fun recycle() {}
}