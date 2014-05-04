package io.kersten.thefuzz.opcodes;

import io.kersten.thefuzz.ArgumentType;
import io.kersten.thefuzz.Opcode;

public class SUB extends Opcode {
    @Override
    public String getMnemonic() {
        return "SUB";
    }

    @Override
    public int getArgumentCount() {
        return 3;
    }

    @Override
    public ArgumentType[] getArgumentTypes() {
        return new ArgumentType[]{
                ArgumentType.REGISTER,
                ArgumentType.VREGISTER,
                ArgumentType.VREGISTER
        };
    }
}
