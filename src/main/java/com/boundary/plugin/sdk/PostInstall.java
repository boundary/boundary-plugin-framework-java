// Copyright 2014 Boundary, Inc.
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

/**
 * Marker interface for any class that needs to run post install
 *
 */
public interface PostInstall {
	
	/**
	 * Called by the Plugin SDK framework for the plugin to
	 * execute code post install.
	 * @param args Arguments passed to the command
	 */
	// TODO, Meter info, platform information, etc
	public void execute(String[] args);
}
