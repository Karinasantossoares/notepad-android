package com.example.register_android.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.register_android.R
import com.example.register_android.databinding.FragmentNotpadBinding
import com.example.register_android.ui.adapter.NotepadAdapter
import com.example.register_android.ui.component.NotepadBottomDialogFragment
import com.example.register_android.viewModel.NotePadViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class NotePadFragment : Fragment() {
    private lateinit var binding: FragmentNotpadBinding
    private val viewModel: NotePadViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentNotpadBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel.stateListNotePad.observe(viewLifecycleOwner, Observer {
            val listNotePadAdapter = NotepadAdapter(
                it,
                onClick = { notepad ->
                    val bundle = bundleOf(NotepadBottomDialogFragment.NOTEPAD to notepad)
                    findNavController().navigate(
                        R.id.action_notePadFragment_to_bottom_sheat_dialog,
                        bundle
                    )
                },
                onLongClick = { notepad ->
                    viewModel.onLongTap(notepad)
                }
            )
            binding.recyclerHomeNoteAdapter.adapter = listNotePadAdapter
        })

        viewModel.shareText.observe(viewLifecycleOwner, Observer {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, it)
            startActivity(intent)
        })


    }

    override fun onResume() {
        super.onResume()
        binding.toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }

    }


}



