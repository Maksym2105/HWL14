package app.service;

import app.models.Device;

public interface Printer {
    void print(Device.Message message);

}

