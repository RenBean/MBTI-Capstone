package com.mbti.services;

import com.mbti.domain.Mbti;
import com.mbti.repositories.MbtiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Ari on 9/6/16.
 */
@Service
public class MbtiServiceImpl implements MbtiService{
    private MbtiRepository mbtiRepository;

    //inject an instance of the Spring Data JPA repository
    @Autowired
    public void setProductRepository(MbtiRepository mbtiRepository) {
        this.mbtiRepository = mbtiRepository;
    }

    //List Questions
    @Override
    public Iterable<Mbti> listAllMbti() {return mbtiRepository.findAll();}

    //Read
    @Override
    public Mbti getMbtiById(Integer id) {
        return mbtiRepository.findOne(id);
    }


}