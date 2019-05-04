package com.jacob;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;
    @Autowired
    private CD cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals(
                "this is PianoCD!!!",
                log.getLog());
    }
}