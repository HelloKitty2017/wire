// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/one_extension.proto
package com.squareup.wire.protos.one_extension;

import com.squareup.wire.Extension;
import com.squareup.wire.WireField;

public final class Ext_one_extension {
  public static final Extension<OneExtension, Foo> foo = Extension.get(OneExtension.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.one_extension.foo",
      1000,
      "com.squareup.wire.protos.one_extension.Foo#ADAPTER");

  private Ext_one_extension() {
  }
}
