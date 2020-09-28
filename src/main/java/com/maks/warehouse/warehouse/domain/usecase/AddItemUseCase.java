package com.maks.warehouse.warehouse.domain.usecase;

import com.maks.warehouse.warehouse.domain.model.Item;
import com.maks.warehouse.warehouse.domain.service.ItemService;

import java.util.List;

public class AddItemUseCase {
    private ItemService itemService;

    public AddItemUseCase(ItemService itemService) {
        this.itemService = itemService;
    }

    public List<Item> invoke() {
        return itemService.getItems();
    }
}
