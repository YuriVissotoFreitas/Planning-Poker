package com.curumi.poker.controller;

import com.curumi.poker.model.Room;
import com.curumi.poker.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<Room> findAll() {
        return roomService.findAll();
    }

    @PostMapping
    public Room save(@RequestBody Room room) {
        return roomService.save(room);
    }
}