package de.lmu.navigator.database.model;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.Required;

/**
 * This class specifies the last element in a Realm tree, as it only has a parent, but no child elements.
 *
 * @param <T> the type of the parent element.
 */
public abstract class RealmLeaf<T> extends RealmObject {

    protected T parent;

    @Ignore
    protected String parentId;

    @Required
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getParent() {
        return parent;
    }

    public void setParent(T parent) {
        this.parent = parent;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
