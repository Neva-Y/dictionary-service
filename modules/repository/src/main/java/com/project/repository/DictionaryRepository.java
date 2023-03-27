package com.project.repository;

import com.project.repository.common.DictionaryError;
import com.project.repository.dictionary.DictionaryEntity;
import io.vavr.control.Either;

import java.util.HashMap;
import java.util.List;

public interface DictionaryRepository {
    public HashMap<String, String> dictionary = new HashMap<>();

    public Either<DictionaryError, Boolean> insertWord(String word, String meaning);

    public Either<DictionaryError, Boolean> updateWord(String word, String meaning);

    public Either<DictionaryError, Boolean> removeWord(String word);

    public Either<DictionaryError, List<DictionaryEntity>> queryWord(String word);

}
