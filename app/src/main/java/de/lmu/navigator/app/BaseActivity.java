package de.lmu.navigator.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import de.lmu.navigator.database.DatabaseManager;
import de.lmu.navigator.database.RealmDatabaseManager;

public class BaseActivity extends ActionBarActivity {

    protected DatabaseManager mDatabaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDatabaseManager = new RealmDatabaseManager(this);
    }

    public DatabaseManager getDatabaseManager() {
        return mDatabaseManager;
    }

    @Override
    protected void onDestroy() {
        mDatabaseManager.close();
        super.onDestroy();
    }
}
