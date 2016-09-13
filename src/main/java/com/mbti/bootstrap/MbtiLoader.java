package com.mbti.bootstrap;

import com.mbti.domain.Mbti;
import com.mbti.repositories.MbtiRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Ari on 9/6/16.
 */
@Component
public class MbtiLoader implements ApplicationListener<ContextRefreshedEvent> {
    private MbtiRepository mbtiRepository;

    private Logger log = Logger.getLogger(MbtiLoader.class);

    @Autowired
    public void setMbtiRepository(MbtiRepository mbtiRepository) {
        this.mbtiRepository = mbtiRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Mbti question1 = new Mbti();
        question1.setQuestion("MBTI Question1 ");
        mbtiRepository.save(question1);

        log.info("Saved Question1 - id: " + question1.getId());

        Mbti question2 = new Mbti();
        question2.setQuestion("MBTI Question2 ");
        mbtiRepository.save(question2);

        log.info("Saved Question2  - id: " + question2.getId());

    }

}
