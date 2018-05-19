/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brynne.zimzam_powerfisher;

import org.powerbot.script.*;
import org.powerbot.script.rt4.ClientContext;

@Script.Manifest(name="zimzam_powerFisher",description="hi",properties="client=4;topic=123;author=Brynne and Lindi;")

public class zimzam_powerFisher extends PollingScript<ClientContext>{
    
    @Override
    public void start(){
        log.info("nigger");
    }
    
    @Override
    public void poll(){
        log.info("suspending Script");
        ctx.controller.suspend();
    }
}
