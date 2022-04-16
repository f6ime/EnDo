package com.example.endo.adapters

import android.annotation.SuppressLint
import com.example.core.base.BaseAdapter
import com.example.db.models.WordsModel
import com.example.endo.R
import com.example.endo.databinding.ItemWordsBinding

class WordsAdapter : BaseAdapter<WordsModel, ItemWordsBinding>(
    R.layout.item_words,
    listOf(), ItemWordsBinding::inflate
) {
    override fun onBind(binding: ItemWordsBinding, model: WordsModel) {
        binding.wordTv.text = model.wordInEnglish
    }

}