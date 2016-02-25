package com.haroldspring.mail;

import org.springframework.stereotype.Component;

@Component
public interface MailSender {

	void send(String to, String subject, String body);

}