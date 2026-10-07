package com.example.firstspringbootapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspringbootapp.demo.entity.ItemEntity;
import com.example.firstspringbootapp.demo.service.ItemService;

@RestController
@RequestMapping(method=RequestMethod.GET, path="/item/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

    @Autowired
    ItemService iserv;

    public ItemController() {
        // TODO Auto-generated constructor stub
    }

    @GetMapping("/printAuthor")
    public String printAuthor() {
        return "Kim Bryan E. Pasu-it";
    }

    //C - Create
    @PostMapping("/postNewItem")
    public ItemEntity postItem(@RequestBody ItemEntity Item) {
        return iserv.postItem(Item);
    }

    //R - Read
    @GetMapping("/getAllItems")
    public List<ItemEntity> getAllItems(){
        return iserv.getAllItems();
    }

    //U - Update
    @PutMapping("/putItem")
    public ItemEntity putItem(@RequestParam int id, @RequestBody ItemEntity newItemDetails) {
        return iserv.putItem(id, newItemDetails);
    }

    //D - Delete
    @DeleteMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable int id) {
        return iserv.deleteItem(id);
    }
}