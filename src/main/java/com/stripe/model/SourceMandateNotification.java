package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class SourceMandateNotification extends StripeObject implements HasId {
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount associated with the mandate
   * notification. The amount is expressed in the currency of the underlying source. Required if the
   * notification type is `debit_initiated`.
   */
  Long amount;

  BacsDebitData bacsDebit;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /**
   * The reason of the mandate notification. Valid reasons are `mandate_confirmed` or
   * `debit_initiated`.
   */
  String reason;

  SepaDebitData sepaDebit;

  Source source;

  /** The status of the mandate notification. Valid statuses are `pending` or `submitted`. */
  String status;

  /**
   * The type of source this mandate notification is attached to. Should be the source type
   * identifier code for the payment method, such as `three_d_secure`.
   */
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BacsDebitData extends StripeObject {
    /** Last 4 digits of the account number associated with the debit. */
    String last4;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaDebitData extends StripeObject {
    /** SEPA creditor ID. */
    String creditorIdentifier;

    /** Last 4 digits of the account number associated with the debit. */
    String last4;

    /** Mandate reference associated with the debit. */
    String mandateReference;
  }
}
