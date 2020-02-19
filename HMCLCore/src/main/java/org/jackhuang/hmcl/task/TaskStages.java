/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2020  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskStages {
    public static final TaskStages EMPTY = new TaskStages();

    private final List<String> stages = new ArrayList<>();
    private final Map<String, String> localization = new HashMap<>();

    protected void addStage(String stage, String localizedMessage) {
        stages.add(stage);
        localization.put(stage, localizedMessage);
    }

    public List<String> getStages() {
        return stages;
    }

    public String localize(String stage) {
        return localization.get(stage);
    }
}