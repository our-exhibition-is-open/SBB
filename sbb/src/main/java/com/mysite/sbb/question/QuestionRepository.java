package com.mysite.sbb.question;

import com.mysite.sbb.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {  /*<>안에는 repository의 대상이 되는
                                                                     entity의 타입과 해당 엔티티의 pk속성(id)의 타입 이 들어감*/

}