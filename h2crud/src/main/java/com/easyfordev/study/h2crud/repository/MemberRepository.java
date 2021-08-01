package com.easyfordev.study.h2crud.repository;

import com.easyfordev.study.h2crud.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    List<Member> findAll();
    Optional<Member> findByName(String name);
}
