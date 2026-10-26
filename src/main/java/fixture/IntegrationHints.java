package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inbound trade from Booking and cashflow from Settlement.
 *
 * <p>Edge fields: data trade frequency real-time from Booking.
 * data cashflow frequency real-time from Settlement.
 */
@RestController
@RequestMapping("/api/v1/confirmations")
public class IntegrationHints {

  // POST /api/v1/confirmations from Booking — data trade, frequency real-time
  // POST /api/v1/cashflows from Settlement — data cashflow, frequency real-time
}
