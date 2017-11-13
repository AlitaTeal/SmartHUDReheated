package net.insomniakitten.smarthud.feature.block; 
 
/*
 *  Copyright 2017 InsomniaKitten
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import net.insomniakitten.smarthud.feature.ISmartHUDFeature;
import net.insomniakitten.smarthud.util.RenderContext;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public final class BlockInfoFeature implements ISmartHUDFeature {

    public BlockInfoFeature() {}

    @Override
    public boolean isEnabled() {
        return true; // FIXME
    }

    @Override
    public RenderGameOverlayEvent.ElementType getType() {
        return RenderGameOverlayEvent.ElementType.TEXT;
    }

    @Override
    public void onRenderTickPre(RenderContext ctx) {

    }

}
