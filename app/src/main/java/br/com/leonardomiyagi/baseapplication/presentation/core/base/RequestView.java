package br.com.leonardomiyagi.baseapplication.presentation.core.base;

/**
 * Created by lmiyagi on 08/11/18.
 */
public interface RequestView extends LoadableView {

    void showError(Throwable throwable, Runnable tryAgainAction);
}
