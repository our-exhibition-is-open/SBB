package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;      /* one to many에 사용 */

import com.mysite.sbb.answer.Answer;
import jakarta.persistence.CascadeType; /* one to many에 사용 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany; /* one to many에 사용 */


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany (mappedBy = "question", cascade = CascadeType.REMOVE)  /* one to many에 사용 */
    private List<Answer> answerList;                                 /* one to many에 사용 */
}
