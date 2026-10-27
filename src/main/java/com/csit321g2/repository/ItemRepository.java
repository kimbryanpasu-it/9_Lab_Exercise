package com.csit321g2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.firstspringbootapp.demo.entity.ItemEntity;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {
}