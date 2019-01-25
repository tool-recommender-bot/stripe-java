package com.stripe.model.radar;

import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class Rule extends StripeObject implements HasId {
  /** The action taken on the payment. */
  String action;

  /** Always true for a deleted object. */
  Boolean deleted;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** The predicate to evaluate the payment against. */
  String predicate;
}
