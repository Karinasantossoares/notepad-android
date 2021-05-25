package com.example.register_android.ui.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.register_android.R
import com.example.register_android.databinding.ItemNotepadListBinding
import com.example.register_android.model.NotePad


class NotepadAdapter(
    private val listNotePad: List<NotePad>,
    private val onClick: (listNotePad: NotePad) -> Unit,
    private val onLongClick: (listNotePad: NotePad) -> Unit
) :
    RecyclerView.Adapter<NotepadAdapter.NotePadViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotePadViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_notepad_list, parent, false)
        return NotePadViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NotePadViewHolder, position: Int) {
        holder.bindView(listNotePad[position])
    }

    override fun getItemCount(): Int = listNotePad.count()

    inner class NotePadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemNotepadListBinding.bind(itemView)

        fun bindView(notePad: NotePad) {
            binding.item = notePad
            ViewCompat.setBackgroundTintList(
                binding.viewHighlighted,
                ColorStateList.valueOf(Color.parseColor(notePad.colorNote))
            )
            binding.container.setOnClickListener {
                onClick.invoke(notePad)
            }

            binding.container.setOnLongClickListener {
                onLongClick.invoke(notePad)
                return@setOnLongClickListener false
            }
        }
    }
}