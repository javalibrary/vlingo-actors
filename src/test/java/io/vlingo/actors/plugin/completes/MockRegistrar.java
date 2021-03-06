// Copyright © 2012-2018 Vaughn Vernon. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.actors.plugin.completes;

import io.vlingo.actors.CompletesEventuallyProvider;
import io.vlingo.actors.LoggerProvider;
import io.vlingo.actors.MailboxProvider;
import io.vlingo.actors.Registrar;
import io.vlingo.actors.World;

public class MockRegistrar implements Registrar {
  public int registerCount;

  @Override
  public void register(String name, CompletesEventuallyProvider completesEventuallyProvider) {
    completesEventuallyProvider.initializeUsing(null);
    ++registerCount;
  }

  @Override
  public void register(String name, boolean isDefault, LoggerProvider loggerProvider) {
  }

  @Override
  public void register(String name, boolean isDefault, MailboxProvider mailboxProvider) {
  }

  @Override
  public void registerCommonSupervisor(String stageName, String name, String fullyQualifiedProtocol, String fullyQualifiedSupervisor) {
  }

  @Override
  public void registerDefaultSupervisor(String stageName, String name, String fullyQualifiedSupervisor) {
  }

  @Override
  public World world() {
    return null;
  }
}
