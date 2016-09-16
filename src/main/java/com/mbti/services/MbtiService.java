package com.mbti.services;

import com.mbti.domain.Mbti;

/**
 * Created by Ari on 9/6/16.
 */
public interface MbtiService {

    Iterable<Mbti> listAllMbti();

    Mbti getMbtiById(Integer id);

}
