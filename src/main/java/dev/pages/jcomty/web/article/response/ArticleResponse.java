package dev.pages.jcomty.web.article.response;

import java.time.LocalDateTime;

import dev.pages.jcomty.web.article.domain.Article;
import lombok.Builder;

@Builder
public record ArticleResponse(
    Long id,
    String title,
    String content,
    String tags,
    String image,
    String imagePublicId,
    Long channelId,
    LocalDateTime createdAt,
    LocalDateTime updatedAt) {

  public static ArticleResponse toArticle(Article article) {
    return ArticleResponse.builder()
        .id(article.getId())
        .title(article.getTitle())
        .content(article.getContent())
        .tags(article.getTags())
        .image(article.getImage())
        .imagePublicId(article.getImagePublicId())
        .channelId(article.getChannel().getId())
        .createdAt(article.getCreatedAt())
        .updatedAt(article.getUpdatedAt())
        .build();
  }
}
