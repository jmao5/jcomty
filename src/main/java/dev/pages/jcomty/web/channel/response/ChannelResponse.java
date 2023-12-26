package dev.pages.jcomty.web.channel.response;

import java.time.LocalDateTime;

import dev.pages.jcomty.web.channel.domain.Channel;
import lombok.Builder;

@Builder
public record ChannelResponse(
    Long id,
    String channelName,
    String description,
    LocalDateTime createdAt,
    LocalDateTime updatedAt) {

  public static ChannelResponse toChannel(Channel channel) {
    return ChannelResponse.builder()
        .id(channel.getId())
        .channelName(channel.getChannelName())
        .description(channel.getDescription())
        .createdAt(channel.getCreatedAt())
        .updatedAt(channel.getUpdatedAt())
        .build();
  }
}
