package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получение всех доступных столиков
     * @return столики
     */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * Изменение бронирования столика
     * @param oldReservation номер старого бронирования, которое нужно изменить
     * @param reservationDate актуальная дата бронирования
     * @param tableNo актуальный номер столика
     * @param name актуальное имя клиента
     */
    int ChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
