package com.hdhelper.agent.bridge;

import com.hdhelper.agent.ClientAccessed;

public final class RenderSwitch {

    private boolean renderLandscape;
    private boolean renderOverlays;

    public RenderSwitch() {
        //By default we shall enable rendering
        renderOverlays  = true;
        renderLandscape = true;
    }

    /**
     * Returns true if and only if the client should render the landscape.
     * When the landscape is not rendered, all of the following will, as
     * a result, not be rendered:
     *      - All entities
     *      - The Floor (tiles)
     * @return True if and only if the client should render the mentioned components, false otherwise
     */
    @ClientAccessed
    public boolean doRenderLandscape() {
        return renderLandscape;
    }

    /**
     * Returns true if and only if the client should render 'Character Overlays'.
     * 'Character Overlays' are defined as:
     *      - Hitsplats
     *      - Hitbars
     *      - Overhead Text
     *      - Prayer Icons
     *      - Skull Icons
     * @return True if the client should render the mentioned components, false otherwise.
     */
    @ClientAccessed
    public boolean doRenderOverlays() {
        return renderOverlays;
    }





    public void setDoRenderLandscape(boolean doRender) {
        this.renderLandscape = doRender;
    }

    public void setDoRenderOverlays(boolean doRender) {
        this.renderOverlays = doRender;
    }

}
