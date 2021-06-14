/*
 * Copyright 2021 DeathsGun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.deathsgun.modmanager.providers.modrinth;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModResult {
    @SerializedName("mod_id")
    private String modId;
    private String title;
    private String description;
    private List<String> versions;
    @SerializedName("icon_url")
    private String iconUrl;

    public String getModId() {
        return modId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getVersions() {
        return versions;
    }

    public String getIconUrl() {
        return iconUrl;
    }
}