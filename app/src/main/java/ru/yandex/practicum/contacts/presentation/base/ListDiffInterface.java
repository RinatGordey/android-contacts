package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;


public interface ListDiffInterface<T> {
    boolean theSameAs(T o);
    boolean equals(Object o);
}
