package com.pea2u.letter2future.service;

import com.pea2u.letter2future.dto.LetterDto;

public interface LetterService {

    boolean createLetter(LetterDto letterDto);

    boolean removeLetter(int id);



}
