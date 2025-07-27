package ru.yandex.practicum.contacts.presentation.base;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
// создали дженерик класс
public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {
    @Override
    @NonNull
    public boolean areItemsTheSame( T oldItem,  T newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    @NonNull
    public boolean areContentsTheSame( T oldItem,  T newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @NonNull
    @Override
    public Object getChangePayload( T oldItem,  T newItem) {
        return newItem;
    }
}

