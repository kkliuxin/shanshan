package com.liu.shan.designpattern.prototype;

import java.util.Random;

/**
 * Created by BBF on 2016/11/22.
 */
public class MailClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("liuxin银行版权所有");
        while(i < 6){
            Mail clonMail = mail.clone();
            clonMail.setAppellation(getRandString(5) + "先生（女士）");
            clonMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(clonMail);
            i++;
        }
    }


    public static void sendMail(Mail mail) {
        System.out.println("标题: " + mail.getSubject() + "\t收件人：" +
                 mail.getReceiver() + "\t发送成功！");

    }

    public static String getRandString(int Maxlength) {
        String source = "abcefghighkmloqprskumrABCDEFKKIED";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < Maxlength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
