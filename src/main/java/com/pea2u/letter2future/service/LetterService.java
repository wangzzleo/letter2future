package com.pea2u.letter2future.service;

import com.pea2u.letter2future.dto.LetterDTO;

public interface LetterService {

    boolean createLetter(LetterDTO letterDto);

    boolean removeLetter(int id);

    int countMyLetter(int custId);
}
