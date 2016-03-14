package com.triangleleft.flashcards.mvp.login.presenter;

import com.triangleleft.flashcards.service.login.Credentials;
import com.triangleleft.flashcards.service.login.ILoginRequest;
import com.triangleleft.flashcards.service.error.CommonError;
import com.triangleleft.flashcards.mvp.login.view.LoginViewState;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class ILoginPresenterStateImpl implements ILoginPresenterState {

    @NonNull
    @Override
    public LoginViewState getViewState() {
        return null;
    }

    @Override
    public void setCredentials(@NonNull Credentials credentials) {

    }

    @NonNull
    @Override
    public Credentials getCredentials() {
        return null;
    }

    @Override
    public void setError(@Nullable CommonError error) {

    }

    @Nullable
    @Override
    public CommonError getError() {
        return null;
    }

    @Override
    public void setRequest(@Nullable ILoginRequest loginRequest) {

    }

    @Nullable
    @Override
    public ILoginRequest getRequest() {
        return null;
    }

    @Override
    public void setViewState(@NonNull LoginViewState state) {

    }
}