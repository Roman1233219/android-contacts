package ru.yandex.practicum.contacts.presentation.base;
//создали интерфейс и два метода согласно задания
public interface ListDiffInterface<T> {
        boolean theSameAs(T object);
        boolean equals(Object object);
}
