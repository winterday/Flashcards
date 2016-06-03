package com.triangleleft.flashcards.login.di;

import com.triangleleft.flashcards.common.di.ApplicationComponent;
import com.triangleleft.flashcards.login.LoginActivity;
import com.triangleleft.flashcards.mvp.common.di.component.IComponent;
import com.triangleleft.flashcards.mvp.common.di.scope.ActivityScope;
import com.triangleleft.flashcards.mvp.login.LoginPresenter;

import dagger.Component;

@ActivityScope
@Component(dependencies = ApplicationComponent.class)
public interface LoginActivityComponent extends IComponent {

    LoginPresenter loginPresenter();

    void inject(LoginActivity loginActivity);
}