package com.hdhelper.injector.bs.scripts.entity;

import com.bytescript.lang.BField;
import com.bytescript.lang.ByteScript;
import com.hdhelper.agent.services.RSGroundItem;

@ByteScript(name = "GroundItem")
public class GroundItem extends Entity implements RSGroundItem {

    @BField int id;
    @BField int quantity;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
