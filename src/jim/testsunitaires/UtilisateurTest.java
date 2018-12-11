package jim.testsunitaires;

import jim.classes.Outils;
import jim.classes.Utilisateur;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.Assert.*;

public class UtilisateurTest {

    private Utilisateur utilisateur1;
    private Utilisateur utilisateur2;

    @Before
    public void setUp() throws Exception {
        utilisateur1 = new Utilisateur();

        int unId = 111;
        String unPseudo = "toto";
        String unMdpSha1 = "abcdef";
        String uneAdrMail = "toto@free.fr";
        String unNumTel = "1122334455";
        int unNiveau = 1;
        Date uneDateCreation = Outils.convertirEnDateHeure("21/06/2016 14:00:00");
        int unNbTraces = 3;
        Date uneDateDerniereTrace = Outils.convertirEnDateHeure("28/06/2016 14:00:00");
        utilisateur2 = new Utilisateur(unId, unPseudo, unMdpSha1, uneAdrMail, unNumTel, unNiveau, uneDateCreation, unNbTraces, uneDateDerniereTrace);
    }

    @Test
    public void testGetId() {
        assertEquals(0, utilisateur1.getId());
        assertEquals(111, utilisateur2.getId());
    }

    @Test
    public void testSetId() {
        int id = 1;
        utilisateur1.setId(id);
        assertEquals(id, utilisateur1.getId());
    }

    @Test
    public void testGetPseudo() {
        assertEquals("toto", utilisateur2.getPseudo());
        assertEquals("", utilisateur1.getPseudo());
    }

    @Test
    public void testSetPseudo() {
        String pseudo = "michaël";
        utilisateur1.setPseudo(pseudo);
        assertEquals(pseudo, utilisateur1.getPseudo());
    }

    @Test
    public void testGetMdpSha1() {
        assertEquals("", utilisateur1.getMdpSha1());
        assertEquals("abcdef", utilisateur2.getMdpSha1());
    }

    @Test
    public void testSetMdpSha1() {
        String mdpSha1 = "Sin";
        utilisateur1.setMdpSha1(mdpSha1);
        assertEquals(mdpSha1, utilisateur1.getMdpSha1());
    }

    @Test
    public void testGetAdrMail() {
        assertEquals("meh", "", utilisateur1.getAdrMail());
        assertEquals("toto@free.fr", utilisateur2.getAdrMail());
    }

    @Test
    public void testSetAdrMail() {
        String adrMail = "lelu.awen@hacari.org";
        utilisateur1.setAdrMail(adrMail);
        assertEquals(adrMail, utilisateur1.getAdrMail());
    }

    @Test
    public void testGetNumTel() {
        assertEquals("", utilisateur1.getAdrMail());
        assertEquals("11.22.33.44.55", utilisateur2.getNumTel());
    }

    @Test
    public void testSetNumTel() {
        String numTel = "1122334456";
        utilisateur1.setNumTel(numTel);
        assertEquals(Outils.corrigerTelephone(numTel), utilisateur1.getNumTel());
    }

    @Test
    public void testGetNiveau() {
        assertEquals(0, utilisateur1.getNiveau());
        assertEquals(1, utilisateur2.getNiveau());
    }

    @Test
    public void testSetNiveau() {
        int level = 1;
        utilisateur1.setNiveau(level);
        assertEquals(level, utilisateur1.getNiveau());
    }

    @Test
    public void testGetDateCreation() throws ParseException {
        assertNull(utilisateur1.getDateCreation());
        assertEquals(Outils.convertirEnDateHeure("21/06/2016 14:00:00"), utilisateur2.getDateCreation());
    }

    @Test
    public void testSetDateCreation() throws ParseException {
        Date date = Outils.convertirEnDateHeure("21/06/2016 14:00:00");
        utilisateur1.setDateCreation(date);
        assertEquals(date, utilisateur1.getDateCreation());
    }

    @Test
    public void testGetNbTraces() {
        assertEquals(0, utilisateur1.getNbTraces());
        assertEquals(3, utilisateur2.getNbTraces());
    }

    @Test
    public void testSetNbTraces() {
        int nbTrace = 13;
        utilisateur1.setNbTraces(nbTrace);
        assertEquals(nbTrace, utilisateur1.getNbTraces());
    }

    @Test
    public void testGetDateDerniereTrace() throws ParseException {
        assertNull(utilisateur1.getDateDerniereTrace());
        assertEquals(Outils.convertirEnDateHeure("28/06/2016 14:00:00"), utilisateur2.getDateDerniereTrace());
    }

    @Test
    public void testSetDateDerniereTrace() throws ParseException {
        Date date = Outils.convertirEnDateHeure("28/06/2016 14:00:00");
        utilisateur1.setDateDerniereTrace(date);
        assertEquals(date, utilisateur1.getDateDerniereTrace());
    }

    @Test
    public void testToString() {
        String msg = "";
        msg += "id : " + "0" + "\n";
        msg += "pseudo : " + "" + "\n";
        msg += "mdpSha1 : " + "" + "\n";
        msg += "adrMail : " + "" + "\n";
        msg += "numTel : " + "" + "\n";
        msg += "niveau : " + "0" + "\n";
        msg += "nbTraces : " + "0" + "\n";
        assertEquals("Test toString", msg, utilisateur1.toString());

        msg = "";
        msg += "id : " + "111" + "\n";
        msg += "pseudo : " + "toto" + "\n";
        msg += "mdpSha1 : " + "abcdef" + "\n";
        msg += "adrMail : " + "toto@free.fr" + "\n";
        msg += "numTel : " + "11.22.33.44.55" + "\n";
        msg += "niveau : " + "1" + "\n";
        msg += "dateCreation : " + "21/06/2016 14:00:00" + "\n";
        msg += "nbTraces : " + "3" + "\n";
        msg += "dateDerniereTrace : " + "28/06/2016 14:00:00" + "\n";
        assertEquals("Test toString", msg, utilisateur2.toString());
    }

}
