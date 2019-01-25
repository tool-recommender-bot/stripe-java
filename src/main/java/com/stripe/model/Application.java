package com.stripe.model;

import javax.annotation.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Generated("com.stripe.generator.entity.SdkBuilder")
public class Application extends StripeObject implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** The name of the application. */
  String name;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;
}
