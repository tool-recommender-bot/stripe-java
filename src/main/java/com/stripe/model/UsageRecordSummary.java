package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class UsageRecordSummary extends StripeObject implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** The invoice in which this usage period has been billed for. */
  String invoice;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  Period period;

  /** The ID of the subscription item this summary is describing. */
  String subscriptionItem;

  /** The total usage within this usage period. */
  Long totalUsage;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Period extends StripeObject {
    /**
     * The end date of this usage period. All usage up to and including this point in time is
     * included.
     */
    Long end;

    /** The start date of this usage period. All usage after this point in time is included. */
    Long start;
  }
}
