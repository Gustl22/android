package de.lmu.navigator.database.model;

import com.google.gson.annotations.SerializedName;

import io.realm.annotations.Ignore;
import io.realm.annotations.Required;

public class BuildingSynonym extends RealmLeaf<Building> {

    @Ignore
    @SerializedName("bCode")
    protected String parentId;

    @Required
    @SerializedName("syn")
    protected String name;
}
