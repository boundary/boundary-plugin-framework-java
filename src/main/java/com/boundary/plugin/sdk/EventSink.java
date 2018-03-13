// Copyright 2015 BMC Software, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.boundary.plugin.sdk;

import java.io.IOException;
import java.net.UnknownHostException;

public interface EventSink {

    public void emit(Event event);

    public String emit(final String eventRpcJson) throws IOException;

    public int openConnection() throws UnknownHostException, IOException;

    public int closeConnection() throws IOException;

}
