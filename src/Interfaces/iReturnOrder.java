package Interfaces;

/**
 * Интерфейc описывающий возможность возврата заказа.
 */
    public interface iReturnOrder {
    /**
     * Метод для возврата заказа.
     */
    void returnOrder();

    /**
     * Метод для проверки возможности возврата заказа.
     *
     * @return true, если заказ возможно вернуть, иначе false.
     */
        boolean isReturnable();
    }

