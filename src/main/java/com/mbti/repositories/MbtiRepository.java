package com.mbti.repositories;

import com.mbti.domain.Mbti;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ari on 9/6/16.
 */
public interface MbtiRepository extends CrudRepository<Mbti, Integer> {
}
