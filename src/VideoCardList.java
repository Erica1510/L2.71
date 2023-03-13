
import java.util.ArrayList;

//Класс представляет список видеокарт и содержит свойства и методы для управления списком.
public class VideoCardList {
    private ArrayList<Video_Cards> videoCards;

    //Конструктор класса VideoCardList. Создает новый список видеокарт.
    public VideoCardList() {
        videoCards = new ArrayList<Video_Cards>();
    }

    //метод добавляет объект Video_Cards в список видеокарт.
    public void addVideoCard(Video_Cards vc) {
        videoCards.add(vc);
    }

    //Удаляет объект Video_Cards из списка видеокарт.
    public void removeVideoCard(Video_Cards vc) {
        videoCards.remove(vc);
    }

    //Возвращает список видеокарт.
    public ArrayList<Video_Cards> getVideoCards() {
        return videoCards;
    }
}