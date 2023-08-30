package Classes;

/**
 * Класс описывающий акционного клиента.
 */
public class PromoClient {
    private String promoName;
    private int clientId;
    private static  int participantsCount;

    /**
     * Конструктор класса PromoClient.
     *
     * @param promoName название акции
     * @param clientId id клиента
     */
    public PromoClient(String promoName, int clientId){
        this.promoName = promoName;
        this.clientId = clientId;
        participantsCount++;
    }

    /**
     * Метод для получения названия акции.
     *
     * @return название акции
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * Метод для получения id клиента.
     *
     * @return id клиента
     */
    public int getClientId() {
        return clientId;
    }
    /**
     * Метод для получения количества участников акции.
     *
     * @return количество участников акции
     */
    public static int getParticipantsCount() {
        return participantsCount;
    }
}

