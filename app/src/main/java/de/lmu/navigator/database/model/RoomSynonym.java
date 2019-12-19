package de.lmu.navigator.database.model;

import com.google.gson.annotations.SerializedName;

import io.realm.annotations.Ignore;
import io.realm.annotations.Required;

public class RoomSynonym extends RealmLeaf<Room> {

    @Ignore
    @SerializedName("rCode")
    protected String parentID;

    @Required
    @SerializedName("syn")
    protected String name;
}
