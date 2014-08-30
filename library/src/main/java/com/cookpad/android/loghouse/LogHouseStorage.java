package com.cookpad.android.loghouse;

import java.util.List;

public interface LogHouseStorage {
    public void insert(String serializedLog);
    public List<String> select();
    public void delete();
}
