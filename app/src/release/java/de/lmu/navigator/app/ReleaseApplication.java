package de.lmu.navigator.app;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.core.CrashlyticsCore;

import de.lmu.navigator.preferences.Preferences;
import io.fabric.sdk.android.Fabric;
import me.alexrs.prefs.lib.Prefs;

public class ReleaseApplication extends RoomfinderApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        // Crash reporting
        if (Prefs.with(this).getBoolean(Preferences.KEY_CRASH_REPORTS, true)) {
            Fabric.with(this, new CrashlyticsCore(), new Answers());
        }
    }
}
