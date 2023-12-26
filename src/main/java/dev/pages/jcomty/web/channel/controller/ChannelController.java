package dev.pages.jcomty.web.channel.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.pages.jcomty.web.channel.repository.ChannelRepository;
import dev.pages.jcomty.web.channel.response.ChannelResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ChannelController {

  private final ChannelRepository channelRepository;

  // @GetMapping("/channels")
  // public List<ChannelResponse> getChannels() {
  // List<Channel> channels = channelRepository.findAll();
  // return ChannelResponse.builder()
  // .channelName(channels)
  // .build();
  // }

  @GetMapping("/channels")
  public List<ChannelResponse> getChannels() {
    return channelRepository
        .findAll()
        .stream()
        .map(ChannelResponse::toChannel)
        .collect(Collectors.toList());
  }

}
