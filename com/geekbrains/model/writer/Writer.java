package com.geekbrains.model.writer;

import java.io.Serializable;

public interface Writer {
    void write(Serializable human);
    Object read();
}
