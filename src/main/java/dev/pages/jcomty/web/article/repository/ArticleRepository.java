package dev.pages.jcomty.web.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.pages.jcomty.web.article.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
