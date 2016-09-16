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
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question1",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question2",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question3",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question4",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question5",1));

        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question6",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question7",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question8",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question9",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question10",1));

        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question11",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question12",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question13",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question14",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question15",1));

        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question16",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question17",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question18",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question19",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question20",1));
    }
}