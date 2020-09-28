package com.maks.warehouse.warehouse.domain.service;

import com.maks.warehouse.warehouse.domain.model.Item;

import java.util.List;

public interface ItemService {

    List<Item> getItems();

    Item findItem(String item);
}
