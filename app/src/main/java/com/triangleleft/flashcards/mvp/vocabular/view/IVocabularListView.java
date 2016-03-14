package com.triangleleft.flashcards.mvp.vocabular.view;

import com.triangleleft.flashcards.mvp.common.view.IView;
import com.triangleleft.flashcards.service.IVocabularWord;

import android.support.annotation.NonNull;

import java.util.List;

public interface IVocabularListView extends IView {

    void showWords(@NonNull List<IVocabularWord> words);

    void showProgress();

    void showError();
}