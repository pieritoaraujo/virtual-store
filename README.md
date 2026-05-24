Creacion de una Tienda Virtual

En este proyecto se ha desarrollado para llevar a cabo diferentes patrones vistos en las clases de Laboratorio

    Strategy

    Adapter

    Observer

Lo que se hizo es un sistema donde se permite registrar productos, agregarlos en un carro de compras, para final calcular el total de toda la compra y observar los diferentes mensajes.
    Patron Strategy
    
    NoDiscountStrategy
    PercentageDiscountStrategy
    FixedAmountDiscountStrategy
Lo que permite es cambiar dinámicamente el tipo de descuento aplicado a una compra.

ClasesImplementadas del Patron Adapter

    PaymentProcessor
    ExternalPaypalService
    PayPalAdapter

También se implementaron métodos de pago propios:
    
    CreditCardPaymentProcessor
    YapePaymentProcessor

Patrón Observer
    
    EmailNotificationObserver
    InventoryObserver
    AdminNotificationObserver

El patrón Observer se utilizó para ejecutar notificaciones automáticas después de confirmar una compra.
    