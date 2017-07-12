package br.com.leonardomiyagi.baseapplication.presentation.graph;

import android.app.Activity;

import br.com.leonardomiyagi.baseapplication.presentation.main.MainActivity;
import br.com.leonardomiyagi.baseapplication.presentation.main.MainComponent;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by SES\leonardom on 12/07/17.
 */
@Module(subcomponents = MainComponent.class)
public abstract class BindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjetorFactory(MainComponent.Builder builder);
}