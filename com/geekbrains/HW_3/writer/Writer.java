package com.geekbrains.HW_3.writer;

import java.io.Serializable;

public interface Writer {
    void write(Serializable human);
    Object read();
}
