package pairmatching.view.validator;

public enum Validator {
    COMMAND("\\w{1}", "[ERROR] 기능 선택은 한 개의 문자만 입력이 가능합니다.");

    private final String validFormat;
    private final String errorMessage;

    Validator(String validFormat, String errorMessage) {
        this.validFormat = validFormat;
        this.errorMessage = errorMessage;
    }

    public String getValidFormat() {
        return validFormat;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void validate(String input) {
        if (isInvalidFormat(input)) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    private boolean isInvalidFormat(String input) {
        return !input.matches(validFormat);
    }
}