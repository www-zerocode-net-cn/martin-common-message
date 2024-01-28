package com.java2e.martin.common.message.mail;

/**
 * @author: 零代科技
 * @version: 1.0
 * @date: 2023/5/21 11:59
 * @describtion: MailService
 */
public interface MailService {

    /**
     * 发送简单文本的邮件
     * @param to
     * @param subject
     * @param content
     * @return
     */
    boolean sendSimpleText(String to, String subject, String content);

    /**
     * 发送 html 的邮件
     * @param to
     * @param subject
     * @param html
     * @return
     */
    boolean sendWithHtml(String to, String subject, String html);

    /**
     * 发送带有图片的 html 的邮件
     * @param to
     * @param subject
     * @param html
     * @param cids
     * @param filePaths
     * @return
     */
    boolean sendWithImageHtml(String to, String subject, String html, String[] cids, String[] filePaths);


    /**
     * 发送带有附件的邮件
     * @param to
     * @param subject
     * @param content
     * @param filePaths
     * @return
     */
    boolean sendWithWithEnclosure(String to, String subject, String content, String[] filePaths);

}
