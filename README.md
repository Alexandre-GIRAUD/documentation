# Documentation (fixture)

Business function: `BACK_OFFICE` (`app.business_function`).
Pillar: `Trade Processing` (`app.pillar`).

Trade documentation. Stores the confirmation generated when a trade is booked.

## Integrations (topology)

- Exposes `/api/v1/confirmations` called by **Booking**.

## Data transiting on flows (Data Model fixture)

| Source | Kind | data_category |
|--------|------|---------------|
| Booking | API (inbound) | `TRADE_CONFIRMATION` |

See `TransitDataTypes.java` and `application.yml`.
