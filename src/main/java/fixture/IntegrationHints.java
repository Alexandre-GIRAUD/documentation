package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inbound trade confirmations from Booking.
 *
 * <p>data_category: TRADE_CONFIRMATION (API).
 */
@RestController
@RequestMapping("/api/v1/confirmations")
public class IntegrationHints {

  // POST /api/v1/confirmations from Booking — data_category TRADE_CONFIRMATION
}
