package com.hdhelper.client.api.action.tree;

import com.hdhelper.client.api.EntityType;
import com.hdhelper.client.api.action.ActionTypes;

public class ExamineEntityAction extends EntityAction {

    public ExamineEntityAction(int opcode, int entity_id, int local_x, int local_y) {
         super(opcode, entity_id, local_x, local_y);
    }

    // Keeps within the scope of examine opcodes
    public static EntityType examineOp2EntityType(int opcode) {
        switch (Action.pruneOpcode(opcode)) {
            case ActionTypes.EXAMINE_OBJECT:
                return EntityType.OBJECT;
            case ActionTypes.EXAMINE_NPC:
                return EntityType.NPC;
            case ActionTypes.EXAMINE_GROUND_ITEM:
                return EntityType.GROUND_ITEM;
        }
        return null;
    }

}
