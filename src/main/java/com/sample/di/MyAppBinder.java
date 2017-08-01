package com.sample.di;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class MyAppBinder extends AbstractBinder {
  @Override
  protected void configure() {
    bind(MainService.class).to(MainService.class);

  }
}
