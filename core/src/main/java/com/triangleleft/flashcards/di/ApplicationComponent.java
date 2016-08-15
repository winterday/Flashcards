package com.triangleleft.flashcards.di;

import com.triangleleft.flashcards.di.scope.ApplicationScope;
import com.triangleleft.flashcards.service.RestService;
import com.triangleleft.flashcards.service.account.AccountModule;
import com.triangleleft.flashcards.service.cards.FlashcardsModule;
import com.triangleleft.flashcards.service.login.LoginModule;
import com.triangleleft.flashcards.service.settings.SettingsModule;
import com.triangleleft.flashcards.service.vocabular.VocabularyModule;
import com.triangleleft.flashcards.ui.FlashcardsNavigator;
import com.triangleleft.flashcards.ui.common.presenter.ComponentManager;
import com.triangleleft.flashcards.util.PersistentStorage;

import dagger.Component;

@ApplicationScope
@Component(modules = {ApplicationModule.class, PlatformModule.class, RestServiceModule.class})
public interface ApplicationComponent extends IComponent {

    LoginModule loginModule();

    VocabularyModule vocabularModule();

    FlashcardsModule flashcardsModule();

    SettingsModule settingsModule();

    AccountModule accountModule();

    ComponentManager componentManager();

    PersistentStorage persistentStorage();

    RestService duolingoRest();

    FlashcardsNavigator navigator();
}