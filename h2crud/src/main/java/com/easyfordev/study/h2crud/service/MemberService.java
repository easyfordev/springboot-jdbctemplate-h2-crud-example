package com.easyfordev.study.h2crud.service;

import com.easyfordev.study.h2crud.domain.Member;
import com.easyfordev.study.h2crud.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * Create) 회원가입
     * @param member 회원 가입할 Member 객체
     * @return 가입 성공한 회원의 ID
     */
    public Long join(Member member){
        memberRepository.save(member);
        return member.getId();
    }

    /**
     * Read) 전체 회원 조회
     * @return List<Member> 전체 회원 목록
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    /**
     * Read) 특정 회원 조회
     * @param name 회원 이름
     * @return Optional<Member> 이름이 name인 회원의 데이터
     */
    public Optional<Member> findOneMember(String name) {
        return memberRepository.findByName(name);
    }

}
