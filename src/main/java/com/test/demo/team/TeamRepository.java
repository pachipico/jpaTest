package com.test.demo.team;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class TeamRepository {

    private final JPAQueryFactory factory;

    private EntityManager em;
}
