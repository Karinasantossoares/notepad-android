package com.example.register_android.ui.component

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.register_android.R
import com.example.register_android.databinding.BottomDialogNotepadBinding
import com.example.register_android.model.NotePad
import com.example.register_android.viewModel.NotePadViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_dialog_notepad.view.*
import org.koin.android.ext.android.bind
import org.koin.android.viewmodel.ext.android.sharedViewModel

class NotepadBottomDialogFragment : BottomSheetDialogFragment() {
    private lateinit var binding: BottomDialogNotepadBinding
    private val viewModel: NotePadViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomDialogNotepadBinding.inflate(inflater, container, true)
        return binding.root
    }

    override fun getTheme(): Int {
        return R.style.BottomSheetTheme
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.setBackgroundColor(Color.TRANSPARENT)
        setFildInformations()
        binding.btnSave.setOnClickListener {
            val newTile = binding.etTitleBottomSheat.text.toString()
            val newDescription = binding.etDescriptionBottomSheat.text.toString()
            viewModel.saveNewNotePad(newTile, newDescription, "#fff")
        }
        binding.btnClose.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    fun setFildInformations() {
        val put = arguments?.getParcelable<NotePad>(NOTEPAD)
        binding.etTitleBottomSheat.setText(put?.title)
        binding.etDescriptionBottomSheat.setText(put?.description)
    }


    companion object {
        const val NOTEPAD = "notepad"
    }
}