package com.lawerly.rajatmareclbeck.lawerly

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lawerly.rajatmareclbeck.lawerly.comman.BaseViewHolder
import com.lawerly.rajatmareclbeck.lawerly.comman.CardItemDecoration
import com.lawerly.rajatmareclbeck.lawerly.extension.toast
import kotlinx.android.synthetic.main.fragment_list.*
import com.poliveira.parallaxrecyclerview.ParallaxRecyclerAdapter


class ListFragment : Fragment() {

    private var dataList: MutableList<Int> = mutableListOf()
    private lateinit var listAdapter: ListAdapter

    companion object {
        fun newInstance() = ListFragment()
    }

    init {
        for (i in 1..20) {
            dataList.add(i)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listAdapter = ListAdapter()

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            addItemDecoration(CardItemDecoration(requireContext()))
            adapter = listAdapter
        }
        listAdapter.setParallaxHeader(layoutInflater.inflate(R.layout.header_list_item, rvList, false), rvList)


    }

    inner class ListAdapter : ParallaxRecyclerAdapter<Int>(dataList) {


        override fun onBindViewHolderImpl(p0: RecyclerView.ViewHolder?, p1: ParallaxRecyclerAdapter<Int>?, p2: Int) {

//             p0?.itemView?.setOnClickListener {
//
//             }

        }

        override fun onCreateViewHolderImpl(p0: ViewGroup, p1: ParallaxRecyclerAdapter<Int>?, p2: Int): RecyclerView.ViewHolder {
            return ItemViewHolder(layoutInflater.inflate(R.layout.list_row_items, p0, false))
        }

        override fun getItemCountImpl(p0: ParallaxRecyclerAdapter<Int>?): Int {
            return dataList.size
        }


    }

    inner class ItemViewHolder(itemView: View) : BaseViewHolder(itemView) {


        init {
            //todo add on click listener on card
        }

        override fun bind() {
            super.bind()
        }
    }
}
