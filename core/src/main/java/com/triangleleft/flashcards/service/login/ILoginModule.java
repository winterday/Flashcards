package com.triangleleft.flashcards.service.login;

import com.triangleleft.flashcards.service.common.IListener;
import com.triangleleft.flashcards.service.common.IProvider;
import com.triangleleft.flashcards.service.common.IProviderRequest;
import com.triangleleft.flashcards.util.FunctionsAreNonnullByDefault;

@FunctionsAreNonnullByDefault
public interface ILoginModule extends IProvider {

    void login(ILoginRequest request, IListener<ILoginResult> listener);

    LoginStatus getLoginStatus();

    void cancelRequest(IProviderRequest request);
}