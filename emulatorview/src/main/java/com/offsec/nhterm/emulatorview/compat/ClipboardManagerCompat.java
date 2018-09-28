package com.offsec.nhterm.emulatorview.compat;

public interface ClipboardManagerCompat {
    CharSequence getText();

    void setText(CharSequence text);

    boolean hasText();
}
