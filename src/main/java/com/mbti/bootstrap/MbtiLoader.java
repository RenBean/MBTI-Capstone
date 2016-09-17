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
        Mbti mbti = new Mbti();
        mbti.setSubject(Mbti.Subject.Assertion);
        mbti.setQuestion("wazup");
        mbti.setAnswer(0);
        mbtiRepository.save(mbti);

        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question1",1));
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question2",2));
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question3",3));
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question4",4));
        mbtiRepository.save(new Mbti(Mbti.Subject.Direction, "MBTI Question5",5));

        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question6",6));
        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question7",7));
        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question8",8));
        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question9",9));
        mbtiRepository.save(new Mbti(Mbti.Subject.Observation, "MBTI Question10",10));

        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question11",11));
        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question12",12));
        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question13",13));
        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question14",14));
        mbtiRepository.save(new Mbti(Mbti.Subject.Orientation, "MBTI Question15",15));

        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question16",16));
        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question17",17));
        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question18",18));
        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question19",18));
        mbtiRepository.save(new Mbti(Mbti.Subject.Assertion, "MBTI Question20",19));
    }
}