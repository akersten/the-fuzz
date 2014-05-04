package io.kersten.thefuzz.opcodes;

import io.kersten.thefuzz.ArgumentType;
import io.kersten.thefuzz.IOpcode;

public class ADD extends IOpcode {
    public ADD() {
        super(Opcode.ADD);
    }

    @Override
    public String getMnemonic() {
        return "ADD";
    }

    @Override
    public int getArgumentCount() {
        return 3;
    }

    @Override
    public ArgumentType[] getArgumentTypes() {
        return new ArgumentType[] {
                ArgumentType.REGISTER,
                ArgumentType.VREGISTER,
                ArgumentType.VREGISTER
        };
    }

    @Override
    public boolean setsZ() {
        return true;
    }

    @Override
    public boolean setsN() {
        return true;
    }

    @Override
    public boolean setsV() {
        return true;
    }
}