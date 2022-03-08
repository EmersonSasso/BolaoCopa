/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolao_copa;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Emerson Jr.
 */
public class Constantes {

    private final static String version = "Werlt 1.0", pass = "eC2vgJPvHou43n6P_RoriGtY_VtkJvUU", user = "yubdrxpi", driver = "org.postgresql.Driver";
    private static int u_code, wgroup;
    private static String host, servico, portNumber, usuario, name;
    private static boolean conectou = false;
    private static String[] aux_string;

    private static JSpinner[] jpA = new JSpinner[64];
    private static JSpinner[] jpB = new JSpinner[64];
    private static JSpinner[] jppB = new JSpinner[64];
    private static JSpinner[] jcaB = new JSpinner[64];
    private static JSpinner[] jcvB = new JSpinner[64];
    private static JSpinner[] jppA = new JSpinner[64];
    private static JSpinner[] jcaA = new JSpinner[64];
    private static JSpinner[] jcvA = new JSpinner[64];
    private static JCheckBox[] jcb = new JCheckBox[64];    
    private static JLabel[] lA = new JLabel[64];
    private static JLabel[] lB = new JLabel[64];
    private static JFormattedTextField[] ftfA = new JFormattedTextField[64];
    private static JFormattedTextField[] ftfB = new JFormattedTextField[64];
    private static JFormattedTextField[] ftcaA = new JFormattedTextField[64];
    private static JFormattedTextField[] ftcvA = new JFormattedTextField[64];
    private static JFormattedTextField[] ftppA = new JFormattedTextField[64];
    private static JFormattedTextField[] ftcaB = new JFormattedTextField[64];
    private static JFormattedTextField[] ftcvB = new JFormattedTextField[64];
    private static JFormattedTextField[] ftppB = new JFormattedTextField[64];
    private static JPanel[] jp = new JPanel[64];
    private static JTextField[] local = new JTextField[64];
    private static JTextField[] data = new JTextField[64];
    private static JTextField[] hora = new JTextField[64];

    public static String getVersion() {
        return version;
    }

    public static int getU_code() {
        return u_code;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setU_code(int aU_code) {
        u_code = aU_code;
    }

    public static void setUsuario(String aUsuario) {
        usuario = aUsuario.toUpperCase();
    }

    public static String getHost() {
        return host;
    }

    public static void setHost(String aHost) {
        host = aHost;
    }

    public static String getServico() {
        return servico;
    }

    public static void setServico(String aServico) {
        servico = aServico;
    }

    public static String getPortNumber() {
        return portNumber;
    }

    public static void setPortNumber(String aPortNumber) {
        portNumber = aPortNumber;
    }

    public static String getPass() {
        return pass;
    }

    public static String getUser() {
        return user;
    }

    public static int getWgroup() {
        return wgroup;
    }

    public static void setWgroup(int aWgroup) {
        wgroup = aWgroup;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String aName) {
        name = aName;
    }

    public static boolean isConectou() {
        return conectou;
    }

    public static void setConectou(boolean aConectou) {
        conectou = aConectou;
    }

    public static String getDriver() {
        return driver;
    }

    public static String[] getAux_string() {
        return aux_string;
    }

    public static void setAux_string(String[] aAux_string) {
        aux_string = aAux_string;
    }

    public static JSpinner[] getJpA() {
        return jpA;
    }

    public static void setJpA(JSpinner[] aJpA) {
        jpA = aJpA;
    }

    public static JSpinner[] getJpB() {
        return jpB;
    }

    public static void setJpB(JSpinner[] aJpB) {
        jpB = aJpB;
    }

    public static JLabel[] getlA() {
        return lA;
    }

    public static void setlA(JLabel[] alA) {
        lA = alA;
    }

    public static JLabel[] getlB() {
        return lB;
    }

    public static void setlB(JLabel[] alB) {
        lB = alB;
    }

    public static JFormattedTextField[] getFtfA() {
        return ftfA;
    }

    public static void setFtfA(JFormattedTextField[] aFtfA) {
        ftfA = aFtfA;
    }

    public static JFormattedTextField[] getFtfB() {
        return ftfB;
    }

    public static void setFtfB(JFormattedTextField[] aFtfB) {
        ftfB = aFtfB;
    }

    public static JPanel[] getJp() {
        return jp;
    }

    public static void setJp(JPanel[] aJp) {
        jp = aJp;
    }

    public static JTextField[] getLocal() {
        return local;
    }

    public static void setLocal(JTextField[] aLocal) {
        local = aLocal;
    }

    public static JTextField[] getData() {
        return data;
    }

    public static void setData(JTextField[] aData) {
        data = aData;
    }

    public static JTextField[] getHora() {
        return hora;
    }

    public static void setHora(JTextField[] aHora) {
        hora = aHora;
    }

    public static JSpinner[] getJppB() {
        return jppB;
    }

    public static void setJppB(JSpinner[] aJppB) {
        jppB = aJppB;
    }

    public static JSpinner[] getJcaB() {
        return jcaB;
    }

    public static void setJcaB(JSpinner[] aJcaB) {
        jcaB = aJcaB;
    }

    public static JSpinner[] getJcvB() {
        return jcvB;
    }

    public static void setJcvB(JSpinner[] aJcvB) {
        jcvB = aJcvB;
    }

    public static JSpinner[] getJppA() {
        return jppA;
    }

    public static void setJppA(JSpinner[] aJppA) {
        jppA = aJppA;
    }

    public static JSpinner[] getJcaA() {
        return jcaA;
    }

    public static void setJcaA(JSpinner[] aJcaA) {
        jcaA = aJcaA;
    }

    public static JSpinner[] getJcvA() {
        return jcvA;
    }

    public static void setJcvA(JSpinner[] aJcvA) {
        jcvA = aJcvA;
    }

    public static JFormattedTextField[] getFtcaA() {
        return ftcaA;
    }

    public static void setFtcaA(JFormattedTextField[] aFtcaA) {
        ftcaA = aFtcaA;
    }

    public static JFormattedTextField[] getFtcvA() {
        return ftcvA;
    }

    public static void setFtcvA(JFormattedTextField[] aFtcvA) {
        ftcvA = aFtcvA;
    }

    public static JFormattedTextField[] getFtppA() {
        return ftppA;
    }

    public static void setFtppA(JFormattedTextField[] aFtppA) {
        ftppA = aFtppA;
    }

    public static JFormattedTextField[] getFtcaB() {
        return ftcaB;
    }

    public static void setFtcaB(JFormattedTextField[] aFtcaB) {
        ftcaB = aFtcaB;
    }

    public static JFormattedTextField[] getFtcvB() {
        return ftcvB;
    }

    public static void setFtcvB(JFormattedTextField[] aFtcvB) {
        ftcvB = aFtcvB;
    }

    public static JFormattedTextField[] getFtppB() {
        return ftppB;
    }

    public static void setFtppB(JFormattedTextField[] aFtppB) {
        ftppB = aFtppB;
    }

    public static JCheckBox[] getJcb() {
        return jcb;
    }

    public static void setJcb(JCheckBox[] aJcb) {
        jcb = aJcb;
    }

}
