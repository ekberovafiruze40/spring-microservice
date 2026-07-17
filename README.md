 Mikroservis Layihəsi

Bu layihə bir-birindən müstəqil şəkildə işləyən iki mikroservis arxitekturasından ibarətdir.

 Servislər haqqında
- User Service: İstifadəçi əməliyyatlarını və məlumatların idarə edilməsini həyata keçirir.
- Order Service: Müştəri sifarişlərinin emalı və idarə edilməsi üçün nəzərdə tutulub.

Nələr icra olunub
 İki ayrı Spring Boot mikroservisi yaradılıb və strukturlaşdırılıb.
 Servislərin eyni vaxtda işləməsini təmin etmək üçün hər birinə müstəqil portlar təyin edilib (8181 və 8282).
 Servislərin API sənədləşdirilməsi və asan test edilməsi üçün Swagger/OpenAPI inteqrasiya edilib.
 Biznes məntiqinin müstəqil şəkildə idarə olunması və servislər arası əlaqənin qurulması üçün backend infrastrukturu yaradılıb.
