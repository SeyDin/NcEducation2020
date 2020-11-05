package com.nc.autumn2020.lesson6Practice.urlki;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlHolder {
    private String protocol;
    private String serverAdress;
    private String onServerAdress = "";
    private int port;
    private KeyValueParametr[] parametrs;

    public UrlHolder(String url) {
        try {
            String decodedUrl = decodeURL(url);
            //System.out.println(decodedUrl);

            String[] fullAdress = decodedUrl.split("\\?", 2);
            if (fullAdress.length > 1) {
                String[] parametrs_in = fullAdress[1].split("&");
                parametrs = new KeyValueParametr[parametrs_in.length];
                for (int i = 0; i < parametrs_in.length; i++) {
                    String[] singlePair = parametrs_in[i].split("=", 2);
                    parametrs[i] = new KeyValueParametr(singlePair[0], singlePair[1]);
                }
            }
            String[] protocolAdressPortOnServerAdress = fullAdress[0].split("://");
            if (protocolAdressPortOnServerAdress.length > 1) {
                protocol = protocolAdressPortOnServerAdress[0];
                String[] AddressPortOnServerAdress = protocolAdressPortOnServerAdress[1].split("/",2);
                if (AddressPortOnServerAdress.length > 1) {
                    onServerAdress = AddressPortOnServerAdress[1];
                }
                String[] AdressPort = AddressPortOnServerAdress[0].split(":");
                if (AdressPort.length > 1){
                    port = Integer.parseInt (AdressPort[1]);
                }
                serverAdress = AdressPort[0];
                }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getServerAdress() {
        return serverAdress;
    }

    public void setServerAdress(String serverAdress) {
        this.serverAdress = serverAdress;
    }

    public String getOnServerAdress() {
        return onServerAdress;
    }

    public void setOnServerAdress(String onServerAdress) {
        this.onServerAdress = onServerAdress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public KeyValueParametr[] getRarametrs() {
        return parametrs;
    }

    public void setParametrs(KeyValueParametr[] keyValueParametrs) {
        this.parametrs = keyValueParametrs;
    }

    @Override
    public String toString() {
        StringBuilder request = new StringBuilder();
        if (protocol != null) request.append(protocol).append("://");
        if (serverAdress != null) request.append(serverAdress);
        if (port != 0) request.append(":").append(port);
        // Проверка на наличие в адресе русских букв, если найдёт, то заменяет их на символы ASCII
        if (onServerAdress != null) {
            String[] onServerAdressArr = onServerAdress.split("/");
            StringBuilder result = new StringBuilder();
            for (String section : onServerAdressArr
            ) {
                boolean cyrillic = section.chars()
                        .mapToObj(Character.UnicodeBlock::of)
                        .anyMatch(b -> b.equals(Character.UnicodeBlock.CYRILLIC));
                if (cyrillic) {
                    String unicodeString = customReplaceAll(URLEncoder.encode(section), "%2C", ",");
                    result.append(unicodeString).append("/");
                } else {
                    result.append(section).append("/");
                }
            }
            result.deleteCharAt(result.length() - 1);
            request.append("/").append(result);
        }

        //if (onServerAdress != null) request.append("/").append(onServerAdress);
        if (parametrs != null) {
            request.append("?");
            StringBuilder paramsTemp = new StringBuilder();
            for (KeyValueParametr pair : parametrs
                 ) {
                try {
                    paramsTemp.append(pair.getKey()).append("=").append(URLEncoder.encode(pair.getValue(), "ASCII")).append("&");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            paramsTemp.deleteCharAt(paramsTemp.length()-1);
            request.append(paramsTemp);
        }
        return request.toString();
    }

    public String detailView() {
        return "UrlHolder{" +
                "protocol='" + protocol + '\'' +
                ", serverAdress='" + serverAdress + '\'' +
                ", onServerAdress='" + onServerAdress + '\'' +
                ", port=" + port +
                ", keyValueParametrs=" + Arrays.toString(parametrs) +
                '}';
    }

    private String decodeURL(String url){ // а эта конструкция вообще имеет смысл? а имеет ли смысл проверка на null после её вызова?
        try {
            String decodedUrl = URLDecoder.decode(url,"UTF-8");
            return decodedUrl;
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return null;
    }

    // Функция реквезирована c javaRush
    public static String customReplaceAll(String str, String oldStr, String newStr) {

        if ("".equals(str) || "".equals(oldStr) || oldStr.equals(newStr)) {
            return str;
        }
        if (newStr == null) {
            newStr = "";
        }
        final int strLength = str.length();
        final int oldStrLength = oldStr.length();
        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i < strLength; i++) {
            int index = builder.indexOf(oldStr, i);

            if (index == -1) {
                if (i == 0) {
                    return str;
                }
                return builder.toString();
            }
            builder = builder.replace(index, index + oldStrLength, newStr);

        }
        return builder.toString();
    }
}
