package com.schedulingapp.misc;

public class ErrorValue {
    //
    // Fields
    //

    private final ErrorType type;
    private final String message;

    //
    // Constructor
    //

    public ErrorValue(String type, String message) {
        this.type = ErrorType.create(type);
        this.message = message;
    }

    //
    // Accessor Methods
    //

    public ErrorType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    //
    // Enums
    //

    public enum ErrorType {
        //
        // Enum Values
        //

        ERROR_TYPE_UNSPECIFIED("ERROR_TYPE_UNSPECIFIED"),
        ERROR("ERROR"),
        NULL_VALUE("NULL_VALUE"),
        DIVIDE_BY_ZERO("DIVIDE_BY_ZERO"),
        VALUE("VALUE"),
        REF("REF"),
        NAME("NAME"),
        NUM("NUM"),
        N_A("N_A"),
        LOADING("LOADING");

        //
        // Fields
        //

        private final String value;

        //
        // Constructor
        //

        ErrorType(String value) {
            this.value = value;
        }

        //
        // Public Methods
        //

        public static ErrorType create(String value) {
            switch(value) {
                case "ERROR":
                    return ERROR;
                case "NULL_VALUE":
                    return NULL_VALUE;
                case "DIVIDE_BY_ZERO":
                    return DIVIDE_BY_ZERO;
                case "VALUE":
                    return VALUE;
                case "REF":
                    return REF;
                case "NAME":
                    return NAME;
                case "NUM":
                    return NUM;
                case "N_A":
                    return N_A;
                case "LOADING":
                    return LOADING;
            }

            return ERROR_TYPE_UNSPECIFIED;
        }

        //
        // Accessor Methods
        //

        public String getValue() {
            return value;
        }
    }
}
