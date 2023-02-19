package com.example.teamsappv1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.teamsappv1.Adapter.ChatOptionAdapter




class ChatFragment : Fragment() {

    private lateinit var root: View



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_chat, container, false)
        initRecyclerView()
        val botonSearch = root.findViewById<EditText>(R.id.etFilter)
        botonSearch.addTextChangedListener {

        }
        return root
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(root.context)
        val recyclerView = root.findViewById<RecyclerView>(R.id.recyclerViewChat)
        val decoration = DividerItemDecoration(recyclerView.context, manager.orientation)
        recyclerView.layoutManager = manager
        recyclerView.adapter = ChatOptionAdapter(ChatProvider.chatList)
        recyclerView.addItemDecoration(decoration)
    }


}