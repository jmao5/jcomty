package dev.pages.jcomty.web.article.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dev.pages.jcomty.web.article.repository.ArticleRepository;
import dev.pages.jcomty.web.article.response.ArticleResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ArticleController {

  private final ArticleRepository articleRepository;

  @GetMapping("/posts/")
  public List<ArticleResponse> getArticles() {
    return articleRepository
        .findAll()
        .stream()
        .map(ArticleResponse::toArticle)
        .collect(Collectors.toList());
  }

  @GetMapping("/posts/{articleId}")
  public List<ArticleResponse> getArticlesByid(@PathVariable String articleId) {
    return articleRepository
        .findAll()
        .stream()
        .map(ArticleResponse::toArticle)
        .collect(Collectors.toList());
  }

}
