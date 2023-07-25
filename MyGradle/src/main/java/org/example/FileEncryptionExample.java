package org.example;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.SaltGenerator;
import org.jasypt.salt.StringFixedSaltGenerator;

import java.io.*;

public class FileEncryptionExample {
    public static void main(String[] args) throws IOException {
        String encryptedOutputFilePath = "/Users/hwangjiwon/supercoding/LearningJava/MyGradle/src/main/resources/encrypted_abc.txt";
        String decryptedOutputFilePath = "/Users/hwangjiwon/supercoding/LearningJava/MyGradle/src/main/resources/decrypted_abc.txt";

        final String PW = "12341234";
        final String ALGORITHM = "PBEWithMD5AndDES";
        final String SALT_GENERATOR = "someFixedSalt";

        //  위 정보를 이용해서 "encryptedOutputFilePath" 파일을 읽고 복호화 하영합니다.
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(PW);
        encryptor.setAlgorithm(ALGORITHM);

        SaltGenerator saltGenerator = new StringFixedSaltGenerator(SALT_GENERATOR);
        encryptor.setSaltGenerator(saltGenerator);


        try {
            String decryptedData = encryptor.decrypt(readTextFile(encryptedOutputFilePath));
            System.out.println("복호화한 코드 : " + decryptedData);
            writeTextFile(decryptedData,decryptedOutputFilePath);
            System.out.println("Decryption completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static void writeTextFile(String text, String filePath) throws IOException {
        FileWriter fw = new FileWriter(filePath, true);
        fw.write(text + "\n");
        fw.flush();
        fw.close();
    }
}
