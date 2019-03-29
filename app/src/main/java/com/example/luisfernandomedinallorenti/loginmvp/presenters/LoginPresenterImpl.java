package com.example.luisfernandomedinallorenti.loginmvp.presenters;

import com.example.luisfernandomedinallorenti.loginmvp.Listeners.OnLoginFinishedListener;
import com.example.luisfernandomedinallorenti.loginmvp.interactors.LoginInteractorImpl;
import com.example.luisfernandomedinallorenti.loginmvp.interfaces.LoginInteractor;
import com.example.luisfernandomedinallorenti.loginmvp.interfaces.LoginPresenter;
import com.example.luisfernandomedinallorenti.loginmvp.interfaces.LoginView;

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {
    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view){
        this.view=view;
        interactor=new LoginInteractorImpl();
    }
    @Override
    public void attempLogin(String username, String password) {
        if (view!=null){
            view.showProgress();
            interactor.validateCredentials(this,username,password);
        }
    }

    @Override
    public void onError() {
        if (view!=null){
            view.hideProgress();
            view.accessDenied();
        }
    }

    @Override
    public void onSuccess() {
        if (view!=null){
            view.hideProgress();
            view.accessSuccesful();
        }
    }
}
