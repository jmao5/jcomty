package dev.pages.jcomty.web.channel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.pages.jcomty.web.channel.domain.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {

}
