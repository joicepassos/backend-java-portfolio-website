package com.portfolio.controllers;

import com.portfolio.util.Constants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.API_ROOT)
public class PostsController {

    @GetMapping(Constants.POSTS)
    public ResponseEntity<?> getPosts() {
        return ResponseEntity.ok().body("Lista de posts");
    }

    @PostMapping(Constants.CREATE_POST)
    public ResponseEntity<?> createPost(@RequestBody String postDetails) {
        return ResponseEntity.ok().body("Post criado");
    }

    @PutMapping(Constants.UPDATE_POST)
    public ResponseEntity<?> updatePost(@PathVariable("id") Long id, @RequestBody String postDetails) {
        return ResponseEntity.ok().body("Post atualizado");
    }

    @DeleteMapping(Constants.DELETE_POST)
    public ResponseEntity<?> deletePost(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body("Post deleted");
    }

    @GetMapping(Constants.GET_POST)
    public ResponseEntity<?> getPost(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body("Detalhes do Post");
    }
}
