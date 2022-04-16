package com.example.endo.bottomsheetdialogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import com.example.core.base.BaseBottomSheetDialog
import com.example.core.extensions.showToast
import com.example.core.extensions.visible
import com.example.db.models.AntonymsCategoryModel
import com.example.db.models.SynonymsCategoryModel
import com.example.db.models.SynonymsModel
import com.example.endo.R
import com.example.endo.databinding.FragmentAddAntonymsCategorySheetDialogBinding
import com.example.endo.databinding.FragmentAddSynonymsBottomSheetDialogBinding
import com.example.endo.databinding.FragmentAddSynonymsCategorySheetDialogFragmentBinding
import com.example.endo.viewmodels.AntonymsCategoryViewModel
import com.example.endo.viewmodels.SynonymsApiViewModel
import com.example.endo.viewmodels.SynonymsCategoryViewModel
import com.example.endo.viewmodels.SynonymsViewModel


class AddAntonymsCategorySheetDialogFragment :
    BaseBottomSheetDialog<FragmentAddAntonymsCategorySheetDialogBinding>
        (FragmentAddAntonymsCategorySheetDialogBinding :: inflate){

    private val viewModel: AntonymsCategoryViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun initClickers() {
        binding.applyButton.setOnClickListener {
            val categoryName = binding.titleEditText.text.toString()
            viewModel.insertData(AntonymsCategoryModel(categoryName = categoryName))
        }
    }

}