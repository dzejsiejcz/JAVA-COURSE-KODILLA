package com.kodilla.good.patterns.challenges.food2door.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kodilla.good.patterns.challenges.food2door.model.Product;
import com.kodilla.good.patterns.challenges.food2door.model.ShopType;
import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.shops.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

public class PurchaseService {

    private final Map<ShopType, Shop> shops = new HashMap<>();

    public PurchaseService() {
        this.shops.put(ShopType.EXTRA_FOOD_SHOP, new ExtraFoodShop());
        this.shops.put(ShopType.HEALTHY_SHOP, new HealthyShop());
        this.shops.put(ShopType.GLUTEN_FREE_SHOP, new GlutenFreeShop());
    }

    public void processOrder(Cart cart) {
        LocalDateTime orderTime = LocalDateTime.now();
        User user = cart.getUser();
        Map<ShopType, List<Choice>> elementsToBuy = new HashMap<>();

        for(Choice choice : cart.getChoices()){
            ShopType shopType = choice.getProduct().getShopType();
            elementsToBuy.putIfAbsent(shopType, new ArrayList<>());
            elementsToBuy.get(shopType).add(choice);
        }

        for(Map.Entry<ShopType, List<Choice>> entry : elementsToBuy.entrySet()){
            Shop chosenShop = shops.get(entry.getKey());
            chosenShop.process(user, orderTime, entry.getValue());
        }
    }

}
