package com.triangleleft.flashcards.di.vocabular;

import com.triangleleft.flashcards.di.main.MainPageComponent;
import com.triangleleft.flashcards.di.scope.FragmentScope;
import com.triangleleft.flashcards.ui.vocabular.VocabularyWordFragment;
import com.triangleleft.flashcards.ui.vocabular.VocabularyWordPresenter;

import dagger.Component;

@FragmentScope
@Component(dependencies = MainPageComponent.class)
public interface VocabularyWordComponent extends MainPageComponent {

    VocabularyWordPresenter vocabularWordPresenter();

    void inject(VocabularyWordFragment vocabularyWordFragment);
}
