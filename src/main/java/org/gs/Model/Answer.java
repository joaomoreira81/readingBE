package org.gs.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Answer extends PanacheMongoEntity {

    private int position;
    private boolean selected;

    public Answer() {}
    public Answer(final int position, final boolean selected) {
        this.position = position;
        this.selected = selected;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
